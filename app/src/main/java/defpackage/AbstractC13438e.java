package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13438e {
    public static final C2892e ad = new C2892e(-460802993, false, new C12341e(11));
    public static final C2892e vip = new C2892e(-872513748, false, new C12341e(12));
    public static final C2892e metrica = new C2892e(421905099, false, new C12341e(13));
    public static final C2892e license = new C2892e(-495423624, false, new C12341e(14));
    public static final C2892e appmetrica = new C2892e(-1012467947, false, new C12341e(15));
    public static final C2892e purchase = new C2892e(1678495476, false, new C12341e(16));
    public static final C2892e billing = new C2892e(1643284633, false, new C14866e(18));

    public static void ad(int i, long[] jArr, long[] jArr2) {
        jArr2[i] = jArr[0];
        jArr2[i + 1] = jArr[1];
        jArr2[i + 2] = jArr[2];
        jArr2[i + 3] = jArr[3];
        jArr2[i + 4] = jArr[4];
        jArr2[i + 5] = jArr[5];
        jArr2[i + 6] = jArr[6];
    }

    public static String vip(C6283e c6283e) {
        StringBuilder sb = new StringBuilder(c6283e.size());
        for (int i = 0; i < c6283e.size(); i++) {
            byte appmetrica2 = c6283e.appmetrica(i);
            if (appmetrica2 == 34) {
                sb.append("\\\"");
            } else if (appmetrica2 == 39) {
                sb.append("\\'");
            } else if (appmetrica2 != 92) {
                switch (appmetrica2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (appmetrica2 < 32 || appmetrica2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((appmetrica2 >>> 6) & 3) + 48));
                            sb.append((char) (((appmetrica2 >>> 3) & 7) + 48));
                            sb.append((char) ((appmetrica2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) appmetrica2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public abstract void metrica(Object obj);
}
