package com.dantsu.escposprinter;

public class EscPosCharsetEncoding {
    private String charsetName;
    private byte[] charsetCommand;

    /**
     * Create new instance of EscPosCharsetEncoding.
     *
     * @param charsetName Name of charset encoding (Ex: windows-1252)
     * @param escPosCharsetId Id of charset encoding for your printer (Ex: 16)
     */
    public EscPosCharsetEncoding(String charsetName, int escPosCharsetId) {
        this.charsetName = charsetName;
        this.charsetCommand = new byte[]{0x1B, 0x74, (byte) escPosCharsetId};
    }

    /**
     * Create new instance of EscPosCharsetEncoding.
     *
     * @param charsetName Name of charset encoding (Ex: windows-1252)
     * @param charsetCommand byte array command for charset encoding (Ex: [0x1B, 0x74, 0x10])
     */
    public EscPosCharsetEncoding(String charsetName, byte[] charsetCommand){
        this.charsetName = charsetName;
        this.charsetCommand = charsetCommand;
    }

    public byte[] getCommand() {
        return this.charsetCommand;
    }

    public String getName() {
        return this.charsetName;
    }
}
