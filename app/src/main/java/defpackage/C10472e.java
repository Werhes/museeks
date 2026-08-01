package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۘؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10472e implements InterfaceC5355e {
    public final InterfaceC8910e ad;
    public final boolean metrica;
    public final C6302e vip;

    public C10472e(InterfaceC8910e interfaceC8910e, C6302e c6302e, boolean z) {
        this.ad = interfaceC8910e;
        this.vip = c6302e;
        this.metrica = z;
    }

    public static Drawable vip(C10472e c10472e, C9302e c9302e) {
        InterfaceC8910e license = AbstractC14385e.license(c10472e.ad, c10472e.metrica);
        try {
            ImageDecoder.Source m3768case = AbstractC14204e.m3768case(license, c10472e.vip, true);
            if (m3768case == null) {
                InterfaceC4895e mo2321e = license.mo2321e();
                try {
                    mo2321e.request(Long.MAX_VALUE);
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) mo2321e.metrica().f31731e);
                    while (!mo2321e.metrica().yandex()) {
                        mo2321e.metrica().read(allocateDirect);
                    }
                    allocateDirect.flip();
                    mo2321e.close();
                    m3768case = ImageDecoder.createSource(allocateDirect);
                } finally {
                }
            }
            Drawable decodeDrawable = ImageDecoder.decodeDrawable(m3768case, new C7010e(c10472e, c9302e, 0));
            AbstractC18453e.ad(license, null);
            return decodeDrawable;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC18453e.ad(license, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v3, types: [eٍؚؔ, java.lang.Object] */
    @Override // defpackage.InterfaceC5355e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.InterfaceC5083e r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.C15195e
            if (r0 == 0) goto L13
            r0 = r9
            eٕٟؓ r0 = (defpackage.C15195e) r0
            int r1 = r0.f30092e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30092e = r1
            goto L1a
        L13:
            eٕٟؓ r0 = new eٕٟؓ
            eُؑ۠ r9 = (defpackage.AbstractC10731e) r9
            r0.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r0.f30090e
            int r1 = r0.f30092e
            r2 = 2
            r3 = 1
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            eٍؚؔ r0 = r0.f30091e
            defpackage.AbstractC2003e.purchase(r9)
            goto L71
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            eٍؚؔ r1 = r0.f30091e
            defpackage.AbstractC2003e.purchase(r9)
            goto L63
        L3c:
            defpackage.AbstractC2003e.purchase(r9)
            eٍؚؔ r9 = new eٍؚؔ
            r9.<init>()
            else r1 = new else
            r5 = 8
            r1.<init>(r8, r9, r5)
            r0.f30091e = r9
            r0.f30092e = r3
            eُؗٓ r3 = new eُؗٓ
            r5 = 0
            r6 = 23
            r3.<init>(r1, r5, r6)
            eؔٚٞ r1 = defpackage.C2693e.f6576e
            java.lang.Object r1 = defpackage.AbstractC5336e.advert(r1, r3, r0)
            if (r1 != r4) goto L60
            goto L6f
        L60:
            r7 = r1
            r1 = r9
            r9 = r7
        L63:
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            r0.f30091e = r1
            r0.f30092e = r2
            java.lang.Object r9 = r8.metrica(r9, r0)
            if (r9 != r4) goto L70
        L6f:
            return r4
        L70:
            r0 = r1
        L71:
            android.graphics.drawable.Drawable r9 = (android.graphics.drawable.Drawable) r9
            eْؖ۟ r9 = defpackage.AbstractC15143e.vip(r9)
            boolean r0 = r0.f18534e
            eؚْٛ r1 = new eؚْٛ
            r1.<init>(r9, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10472e.ad(eًؗۖ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(android.graphics.drawable.Drawable r8, defpackage.AbstractC10731e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.C11366e
            if (r0 == 0) goto L13
            r0 = r9
            eُۣۥ r0 = (defpackage.C11366e) r0
            int r1 = r0.f22880e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f22880e = r1
            goto L18
        L13:
            eُۣۥ r0 = new eُۣۥ
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f22878e
            int r1 = r0.f22880e
            r2 = 1
            eَؙؗ r3 = r7.vip
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.Object r8 = r0.f22879e
            android.graphics.drawable.Drawable r8 = (android.graphics.drawable.Drawable) r8
            defpackage.AbstractC2003e.purchase(r9)
            goto L87
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            defpackage.AbstractC2003e.purchase(r9)
            boolean r9 = r8 instanceof android.graphics.drawable.AnimatedImageDrawable
            if (r9 != 0) goto L3b
            return r8
        L3b:
            eّۨؒ r9 = defpackage.AbstractC13467e.ad
            java.lang.Object r1 = defpackage.AbstractC8306e.license(r3, r9)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r4 = -2
            if (r1 == r4) goto L5a
            r1 = r8
            android.graphics.drawable.AnimatedImageDrawable r1 = (android.graphics.drawable.AnimatedImageDrawable) r1
            java.lang.Object r9 = defpackage.AbstractC8306e.license(r3, r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r1.setRepeatCount(r9)
        L5a:
            eّۨؒ r9 = defpackage.AbstractC13467e.metrica
            java.lang.Object r9 = defpackage.AbstractC8306e.license(r3, r9)
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            eّۨؒ r1 = defpackage.AbstractC13467e.license
            java.lang.Object r1 = defpackage.AbstractC8306e.license(r3, r1)
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            if (r9 != 0) goto L6e
            if (r1 == 0) goto L87
        L6e:
            eّٕٓ r4 = defpackage.AbstractC6731e.ad
            eْؐؔ r4 = defpackage.AbstractC1497e.ad
            eْؐؔ r4 = r4.f25795e
            eؔؓۧ r5 = new eؔؓۧ
            r6 = 0
            r5.<init>(r8, r9, r1, r6)
            r0.f22879e = r8
            r0.f22880e = r2
            java.lang.Object r9 = defpackage.AbstractC5336e.advert(r4, r5, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r9 != r0) goto L87
            return r0
        L87:
            eًٍ۠ r9 = new eًٍ۠
            int r0 = r3.metrica
            r9.<init>(r8, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10472e.metrica(android.graphics.drawable.Drawable, eُؑ۠):java.lang.Object");
    }
}
