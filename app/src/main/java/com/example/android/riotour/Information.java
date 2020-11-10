package com.example.android.riotour;

public class Information {

    private int mNome;

    private int mDescricao;

    private int mTelefone;

    private int mEndereco;

    private int mImage;


    public Information(int nome, int descricao, int telefone, int endereco, int image) {

        mNome = nome;
        mDescricao = descricao;
        mTelefone = telefone;
        mEndereco = endereco;
        mImage = image;
    }

    public int getmNome() {
        return mNome;
    }

    public int getmDescricao() {
        return mDescricao;
    }

    public int getmTelefone() {
        return mTelefone;
    }

    public int getmEndereco() {
        return mEndereco;
    }

    public int getmImage() {
        return mImage;
    }
}
