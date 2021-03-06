package tk.swghosh.guimodel;

//MVC Design Pattern, =>Model
//Title:CheckBoard

public class CheckBoard
{
  private byte[][] mat;
  private int usr1,usr2;
  public CheckBoard()
  {
      mat=new byte[8][8];
      usr1=0;
      usr2=0;
      for(int i=0;i<8;i++)
      {
          mat[0][i]=1;mat[7][i]=2;
      }
  }
  public byte[][] getContents()
  {
      return mat;
  }
  public int[] score()
  {
      int[] m={usr1,usr2};
      return m;
  }
  public void move(int rin,int cin)
  {
      try
      {
          if(mat[rin][cin]==1)
          {
              if(mat[rin+1][cin]==2)
              {
                  usr1++;
                  mat[rin][cin]=0;
                  mat[rin+1][cin]=1;
              }
              else
              {
                  mat[rin][cin]=0;
                  mat[rin+1][cin]=1;
              }
          }
          else if(mat[rin][cin]==2)
          {
              if(mat[rin-1][cin]==1)
              {
                  usr2++;
                  mat[rin][cin]=0;
                  mat[rin-1][cin]=2;
              }
              else
              {
                  mat[rin][cin]=0;
                  mat[rin-1][cin]=2;
              }
          }
          else if(mat[rin][cin]==0)
          {
              throw new ArrayIndexOutOfBoundsException();
          }
      }
      catch(ArrayIndexOutOfBoundsException ex)
      {
      }
  }
}