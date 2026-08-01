package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۛۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15733e implements InterfaceC5372e {
    public static final C15733e ad = new Object();
    public static final C3859e vip = new C3859e("kotlin.uuid.Uuid", C13337e.smaato);

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        interfaceC5757e.remoteconfig(((C2335e) obj).toString());
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        return vip;
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        String pro = interfaceC11754e.pro();
        int length = pro.length();
        int i = 0;
        if (length == 32) {
            long j = 0;
            while (i < 16) {
                long j2 = j << 4;
                char charAt = pro.charAt(i);
                if ((charAt >>> '\b') == 0) {
                    long j3 = AbstractC12368e.metrica[charAt];
                    if (j3 >= 0) {
                        j = j2 | j3;
                        i++;
                    }
                }
                AbstractC8294e.yandex(pro, i, "a hexadecimal digit");
                throw null;
            }
            long j4 = 0;
            for (int i2 = 16; i2 < 32; i2++) {
                long j5 = j4 << 4;
                char charAt2 = pro.charAt(i2);
                if ((charAt2 >>> '\b') == 0) {
                    long j6 = AbstractC12368e.metrica[charAt2];
                    if (j6 >= 0) {
                        j4 = j5 | j6;
                    }
                }
                AbstractC8294e.yandex(pro, i2, "a hexadecimal digit");
                throw null;
            }
            if (j != 0 || j4 != 0) {
                return new C2335e(j, j4);
            }
        } else {
            if (length != 36) {
                StringBuilder sb = new StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
                sb.append(pro.length() <= 64 ? pro : pro.substring(0, 64).concat("..."));
                sb.append("\" of length ");
                sb.append(pro.length());
                throw new IllegalArgumentException(sb.toString());
            }
            long j7 = 0;
            while (i < 8) {
                long j8 = j7 << 4;
                char charAt3 = pro.charAt(i);
                if ((charAt3 >>> '\b') == 0) {
                    long j9 = AbstractC12368e.metrica[charAt3];
                    if (j9 >= 0) {
                        j7 = j8 | j9;
                        i++;
                    }
                }
                AbstractC8294e.yandex(pro, i, "a hexadecimal digit");
                throw null;
            }
            if (pro.charAt(8) != '-') {
                AbstractC8294e.yandex(pro, 8, "'-' (hyphen)");
                throw null;
            }
            long j10 = 0;
            for (int i3 = 9; i3 < 13; i3++) {
                long j11 = j10 << 4;
                char charAt4 = pro.charAt(i3);
                if ((charAt4 >>> '\b') == 0) {
                    long j12 = AbstractC12368e.metrica[charAt4];
                    if (j12 >= 0) {
                        j10 = j11 | j12;
                    }
                }
                AbstractC8294e.yandex(pro, i3, "a hexadecimal digit");
                throw null;
            }
            if (pro.charAt(13) != '-') {
                AbstractC8294e.yandex(pro, 13, "'-' (hyphen)");
                throw null;
            }
            long j13 = 0;
            for (int i4 = 14; i4 < 18; i4++) {
                long j14 = j13 << 4;
                char charAt5 = pro.charAt(i4);
                if ((charAt5 >>> '\b') == 0) {
                    long j15 = AbstractC12368e.metrica[charAt5];
                    if (j15 >= 0) {
                        j13 = j14 | j15;
                    }
                }
                AbstractC8294e.yandex(pro, i4, "a hexadecimal digit");
                throw null;
            }
            if (pro.charAt(18) != '-') {
                AbstractC8294e.yandex(pro, 18, "'-' (hyphen)");
                throw null;
            }
            long j16 = 0;
            for (int i5 = 19; i5 < 23; i5++) {
                long j17 = j16 << 4;
                char charAt6 = pro.charAt(i5);
                if ((charAt6 >>> '\b') == 0) {
                    long j18 = AbstractC12368e.metrica[charAt6];
                    if (j18 >= 0) {
                        j16 = j17 | j18;
                    }
                }
                AbstractC8294e.yandex(pro, i5, "a hexadecimal digit");
                throw null;
            }
            if (pro.charAt(23) != '-') {
                AbstractC8294e.yandex(pro, 23, "'-' (hyphen)");
                throw null;
            }
            long j19 = 0;
            for (int i6 = 24; i6 < 36; i6++) {
                long j20 = j19 << 4;
                char charAt7 = pro.charAt(i6);
                if ((charAt7 >>> '\b') == 0) {
                    long j21 = AbstractC12368e.metrica[charAt7];
                    if (j21 >= 0) {
                        j19 = j20 | j21;
                    }
                }
                AbstractC8294e.yandex(pro, i6, "a hexadecimal digit");
                throw null;
            }
            long j22 = (j7 << 32) | (j10 << 16) | j13;
            long j23 = (j16 << 48) | j19;
            if (j22 != 0 || j23 != 0) {
                return new C2335e(j22, j23);
            }
        }
        return C2335e.f5851e;
    }
}
