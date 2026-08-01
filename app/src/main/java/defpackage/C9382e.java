package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9382e {
    public static final SparseIntArray adcel;
    public int ad;
    public float appmetrica;
    public int billing;
    public float license;
    public int metrica;
    public float purchase;
    public int startapp;
    public int vip;
    public String yandex;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        adcel = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    public final void ad(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC15320e.purchase);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (adcel.get(index)) {
                case 1:
                    this.appmetrica = obtainStyledAttributes.getFloat(index, this.appmetrica);
                    break;
                case 2:
                    this.metrica = obtainStyledAttributes.getInt(index, this.metrica);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC15428e.ad[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.ad = C16732e.purchase(obtainStyledAttributes, index, this.ad);
                    break;
                case 6:
                    this.vip = obtainStyledAttributes.getInteger(index, this.vip);
                    break;
                case 7:
                    this.license = obtainStyledAttributes.getFloat(index, this.license);
                    break;
                case 8:
                    this.billing = obtainStyledAttributes.getInteger(index, this.billing);
                    break;
                case 9:
                    this.purchase = obtainStyledAttributes.getFloat(index, this.purchase);
                    break;
                case 10:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.startapp = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.yandex = string;
                        if (string.indexOf("/") > 0) {
                            this.startapp = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.startapp);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
