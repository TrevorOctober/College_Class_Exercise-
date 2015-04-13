/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package device;

/**
 *
 * @author LUCKY MBUTHO
 */
public class CD extends Device {
    
    private String Artist, title;
    private int tracks;

    public CD(String Artist, String title, 
            int tracks, String name, double size) {
        super(name, size);
        this.Artist = Artist;
        this.title = title;
        this.tracks = tracks;
    }

    public String getArtist() {
        return Artist;
    }

    public String getTitle() {
        return title;
    }

    public int getTracks() {
        return tracks;
    }

    
    @Override
    public void showDevice() {
        super.showDevice();
        System.out.println(getArtist()+" is the artist");
        System.out.println(getTitle()+" is the title");
        System.out.println(getTracks()+" tracks");
        
    }

    
    
    
    
}
