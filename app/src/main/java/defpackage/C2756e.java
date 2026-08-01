package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٞۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2756e {
    public int ad;
    public int appmetrica;
    public int license;
    public int metrica;
    public int purchase;
    public int vip;

    public /* synthetic */ C2756e(int i, int i2, int i3, int i4, int i5, int i6) {
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = i4;
        this.appmetrica = i5;
        this.purchase = i6;
    }

    public static C2756e ad(String str) {
        char c;
        AbstractC2301e.billing(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        for (int i6 = 0; i6 < split.length; i6++) {
            String tapsense = AbstractC3628e.tapsense(split[i6].trim());
            tapsense.getClass();
            switch (tapsense.hashCode()) {
                case 100571:
                    if (tapsense.equals("end")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3556653:
                    if (tapsense.equals("text")) {
                        c = 1;
                        break;
                    }
                    break;
                case 102749521:
                    if (tapsense.equals("layer")) {
                        c = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (tapsense.equals("start")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109780401:
                    if (tapsense.equals("style")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    i3 = i6;
                    break;
                case 1:
                    i5 = i6;
                    break;
                case 2:
                    i = i6;
                    break;
                case 3:
                    i2 = i6;
                    break;
                case 4:
                    i4 = i6;
                    break;
            }
        }
        if (i2 == -1 || i3 == -1 || i5 == -1) {
            return null;
        }
        return new C2756e(i, i2, i3, i4, i5, split.length);
    }
}
