package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؒٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1003e extends AbstractC1038e {
    public final /* synthetic */ int license;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1003e(int i, int i2, String str) {
        super(i, str);
        this.license = i2;
    }

    public static int metrica(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < '[') {
            return c - '7';
        }
        if (c == ' ') {
            return 36;
        }
        if (c == ':') {
            return 44;
        }
        if (c == '$') {
            return 37;
        }
        if (c == '%') {
            return 38;
        }
        if (c == '*') {
            return 39;
        }
        if (c == '+') {
            return 40;
        }
        switch (c) {
            case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                return 41;
            case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                return 42;
            case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                return 43;
            default:
                throw new IllegalArgumentException("Illegal character: " + c);
        }
    }

    @Override // defpackage.AbstractC1038e
    public final int ad() {
        switch (this.license) {
            case 0:
                return this.metrica.length();
            default:
                return this.metrica.length();
        }
    }

    @Override // defpackage.AbstractC1038e
    public final void vip(C2025e c2025e) {
        switch (this.license) {
            case 0:
                String str = this.metrica;
                int length = str.length();
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i2 >= length) {
                        if (i < length) {
                            c2025e.yandex(metrica(str.charAt(i)), 6);
                            return;
                        }
                        return;
                    } else {
                        c2025e.yandex(metrica(str.charAt(i2)) + (metrica(str.charAt(i)) * 45), 11);
                        i += 2;
                    }
                }
            default:
                String str2 = this.metrica;
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 2;
                    if (i4 >= length2) {
                        if (i3 < length2) {
                            int i5 = length2 - i3;
                            if (i5 == 1) {
                                c2025e.yandex(Integer.parseInt(str2.substring(i3, i3 + 1)), 4);
                                return;
                            } else {
                                if (i5 == 2) {
                                    c2025e.yandex(Integer.parseInt(str2.substring(i3, i4)), 7);
                                    return;
                                }
                                return;
                            }
                        }
                        return;
                    }
                    int i6 = i3 + 3;
                    c2025e.yandex(Integer.parseInt(str2.substring(i3, i6)), 10);
                    i3 = i6;
                }
        }
    }
}
