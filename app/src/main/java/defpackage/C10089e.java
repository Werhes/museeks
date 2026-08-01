package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؘٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10089e {
    public final Context ad;
    public final C5363e vip = new C5363e(new C12851e(26, this));

    public C10089e(VKXApplication vKXApplication) {
        this.ad = vKXApplication;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int ad(int r3) {
        /*
            r2 = this;
            eؘؒؐ r0 = r2.vip
            java.lang.Object r0 = r0.getValue()
            eٟؖ۟ r0 = (defpackage.C4411e) r0
            boolean r1 = defpackage.AbstractC1129e.license
            if (r1 == 0) goto L39
            switch(r3) {
                case 1: goto L35;
                case 2: goto L31;
                case 3: goto L2d;
                case 4: goto L29;
                case 5: goto L25;
                case 6: goto L21;
                case 7: goto L1d;
                case 8: goto L19;
                case 9: goto L15;
                case 10: goto L11;
                default: goto Lf;
            }
        Lf:
            r3 = 0
            throw r3
        L11:
            r3 = 17170478(0x106002e, float:2.4612042E-38)
            goto L59
        L15:
            r3 = 17170483(0x1060033, float:2.4612056E-38)
            goto L59
        L19:
            r3 = 17170464(0x1060020, float:2.4612003E-38)
            goto L59
        L1d:
            r3 = 17170472(0x1060028, float:2.4612025E-38)
            goto L59
        L21:
            r3 = 17170503(0x1060047, float:2.4612112E-38)
            goto L59
        L25:
            r3 = 17170509(0x106004d, float:2.461213E-38)
            goto L59
        L29:
            r3 = 17170510(0x106004e, float:2.4612132E-38)
            goto L59
        L2d:
            r3 = 17170504(0x1060048, float:2.4612115E-38)
            goto L59
        L31:
            r3 = 17170497(0x1060041, float:2.4612095E-38)
            goto L59
        L35:
            r3 = 17170491(0x106003b, float:2.4612078E-38)
            goto L59
        L39:
            switch(r3) {
                case 1: goto L56;
                case 2: goto L52;
                case 3: goto L4e;
                case 4: goto L4a;
                case 5: goto L21;
                case 6: goto L46;
                case 7: goto L42;
                case 8: goto L1d;
                case 9: goto L3e;
                case 10: goto L15;
                default: goto L3c;
            }
        L3c:
            r3 = 0
            throw r3
        L3e:
            r3 = 17170477(0x106002d, float:2.461204E-38)
            goto L59
        L42:
            r3 = 17170462(0x106001e, float:2.4611997E-38)
            goto L59
        L46:
            r3 = 17170511(0x106004f, float:2.4612134E-38)
            goto L59
        L4a:
            r3 = 17170500(0x1060044, float:2.4612104E-38)
            goto L59
        L4e:
            r3 = 17170508(0x106004c, float:2.4612126E-38)
            goto L59
        L52:
            r3 = 17170487(0x1060037, float:2.4612067E-38)
            goto L59
        L56:
            r3 = 17170495(0x106003f, float:2.461209E-38)
        L59:
            int r3 = r0.getColor(r3)
            r0 = 255(0xff, float:3.57E-43)
            int r3 = defpackage.AbstractC3898e.startapp(r3, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10089e.ad(int):int");
    }

    public final int vip(float f) {
        int ad = ad(7);
        int ad2 = ad(1);
        Handler handler = AbstractC15933e.ad;
        float f2 = 100.0f - ((int) (f * 100.0f));
        return Color.argb((int) Math.floor(((Color.alpha(ad2) / 100.0f) * r9) + ((Color.alpha(ad) / 100.0f) * f2)), (int) Math.floor(((Color.red(ad2) / 100.0f) * r9) + ((Color.red(ad) / 100.0f) * f2)), (int) Math.floor(((Color.green(ad2) / 100.0f) * r9) + ((Color.green(ad) / 100.0f) * f2)), (int) Math.floor(((Color.blue(ad2) / 100.0f) * r9) + ((Color.blue(ad) / 100.0f) * f2)));
    }
}
