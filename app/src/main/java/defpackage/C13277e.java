package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13277e {
    public static final SparseIntArray amazon;
    public float ad;
    public float adcel;
    public boolean advert;
    public float appmetrica;
    public float billing;
    public float license;
    public float metrica;
    public float mopub;
    public float purchase;
    public float smaato;
    public float startapp;
    public float vip;
    public int yandex;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        amazon = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    public final void ad(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC15320e.startapp);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (amazon.get(index)) {
                case 1:
                    this.ad = obtainStyledAttributes.getFloat(index, this.ad);
                    break;
                case 2:
                    this.vip = obtainStyledAttributes.getFloat(index, this.vip);
                    break;
                case 3:
                    this.metrica = obtainStyledAttributes.getFloat(index, this.metrica);
                    break;
                case 4:
                    this.license = obtainStyledAttributes.getFloat(index, this.license);
                    break;
                case 5:
                    this.appmetrica = obtainStyledAttributes.getFloat(index, this.appmetrica);
                    break;
                case 6:
                    this.purchase = obtainStyledAttributes.getDimension(index, this.purchase);
                    break;
                case 7:
                    this.billing = obtainStyledAttributes.getDimension(index, this.billing);
                    break;
                case 8:
                    this.startapp = obtainStyledAttributes.getDimension(index, this.startapp);
                    break;
                case 9:
                    this.adcel = obtainStyledAttributes.getDimension(index, this.adcel);
                    break;
                case 10:
                    this.mopub = obtainStyledAttributes.getDimension(index, this.mopub);
                    break;
                case 11:
                    this.advert = true;
                    this.smaato = obtainStyledAttributes.getDimension(index, this.smaato);
                    break;
                case 12:
                    this.yandex = C16732e.purchase(obtainStyledAttributes, index, this.yandex);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
