package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import androidx.car.app.model.Alert;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16213e extends AbstractC9882e {
    public final C2691e billing;
    public C8419e startapp;
    public final C14137e yandex;

    public C16213e(C11950e c11950e, C2691e c2691e, C9786e c9786e, InterfaceC14388e interfaceC14388e) {
        super(c11950e, c9786e, interfaceC14388e);
        this.billing = c2691e;
        this.yandex = AbstractC12501e.ad(Alert.DURATION_SHOW_INDEFINITELY, 0, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0168, code lost:
    
        if (r0.invoke(r1, r10) != r14) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    /* JADX WARN: Type inference failed for: r0v20, types: [eُؚٓ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, eٔۦْ] */
    /* JADX WARN: Type inference failed for: r2v5, types: [eّؖٝ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [eّؖٝ, java.lang.Object] */
    /* renamed from: case, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4143case(defpackage.C16213e r20, defpackage.C11950e r21, defpackage.C1181e r22, float r23, float r24, defpackage.AbstractC10731e r25) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16213e.m4143case(eٖٔۗ, eِۙ, eؒٛۡ, float, float, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: catch, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4144catch(defpackage.C16213e r11, defpackage.C4246e r12, defpackage.C15096e r13, defpackage.C11950e r14, defpackage.C4246e r15, long r16, defpackage.AbstractC10731e r18) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16213e.m4144catch(eٖٔۗ, eّؖٝ, eٔۦْ, eِۙ, eّؖٝ, long, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: new, reason: not valid java name */
    public static C1181e m4145new(C14137e c14137e) {
        C1181e c1181e = null;
        C4300e license = AbstractC16342e.license(new license((Object) new C16419e(c14137e, 0), (InterfaceC5083e) (0 == true ? 1 : 0), 3));
        while (license.hasNext()) {
            C1181e c1181e2 = (C1181e) license.next();
            if (c1181e != null) {
                c1181e2 = c1181e.ad(c1181e2);
            }
            c1181e = c1181e2;
        }
        return c1181e;
    }

    /* renamed from: final, reason: not valid java name */
    public final float m4146final(C3593e c3593e, float f) {
        C11950e c11950e = (C11950e) this.vip;
        long yandex = c11950e.yandex(c11950e.license(f));
        C11950e c11950e2 = c3593e.ad;
        return c11950e.billing(c11950e.appmetrica(c11950e2.metrica(c11950e2.mopub, yandex, 1)));
    }

    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* renamed from: super, reason: not valid java name */
    public final boolean m4147super(C2561e c2561e) {
        long j;
        InterfaceC14388e interfaceC14388e = (InterfaceC14388e) this.license;
        C2691e c2691e = this.billing;
        ViewConfiguration viewConfiguration = (ViewConfiguration) c2691e.f6570e;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? AbstractC0551e.license(viewConfiguration) : interfaceC14388e.mo497instanceof(64));
        float f2 = -(i > 26 ? AbstractC0551e.ad(viewConfiguration) : interfaceC14388e.mo497instanceof(64));
        ?? r2 = c2561e.ad;
        C2152e c2152e = new C2152e(0L);
        int size = r2.size();
        int i2 = 0;
        while (true) {
            j = c2152e.ad;
            if (i2 >= size) {
                break;
            }
            c2152e = new C2152e(C2152e.startapp(j, ((C2401e) r2.get(i2)).adcel));
            i2++;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f) & 4294967295L);
        C11950e c11950e = (C11950e) this.vip;
        float startapp = c11950e.startapp(c11950e.appmetrica(floatToRawIntBits));
        if (!(startapp != 0.0f ? startapp > 0.0f ? c11950e.ad.license() : c11950e.ad.metrica() : false)) {
            return this.metrica;
        }
        long j2 = ((C2401e) AbstractC13480e.m3591interface(c2561e.ad)).vip;
        c2691e.getClass();
        return !(this.yandex.amazon(new C1181e(floatToRawIntBits, j2, false)) instanceof C8870e);
    }
}
