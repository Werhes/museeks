package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1521e implements InterfaceC15433e {
    public final AbstractC4291e ad;
    public final boolean metrica;
    public final C11672e vip;

    public C1521e(C11672e c11672e, AbstractC4291e abstractC4291e) {
        C6607e c6607e = AbstractC10199e.ad;
        this.vip = c11672e;
        this.metrica = abstractC4291e instanceof AbstractC15267e;
        this.ad = abstractC4291e;
    }

    @Override // defpackage.InterfaceC15433e
    public final void ad(Object obj) {
        this.vip.getClass();
        C10308e c10308e = ((AbstractC17076e) obj).zzc;
        if (c10308e.appmetrica) {
            c10308e.appmetrica = false;
        }
        C6607e c6607e = AbstractC10199e.ad;
        ((AbstractC15267e) obj).zzb.license();
    }

    @Override // defpackage.InterfaceC15433e
    public final boolean appmetrica(AbstractC17076e abstractC17076e, AbstractC17076e abstractC17076e2) {
        if (!abstractC17076e.zzc.equals(abstractC17076e2.zzc)) {
            return false;
        }
        if (this.metrica) {
            return ((AbstractC15267e) abstractC17076e).zzb.equals(((AbstractC15267e) abstractC17076e2).zzb);
        }
        return true;
    }

    @Override // defpackage.InterfaceC15433e
    public final int billing(AbstractC4291e abstractC4291e) {
        C10308e c10308e = ((AbstractC17076e) abstractC4291e).zzc;
        int i = c10308e.license;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < c10308e.ad; i2++) {
                int i3 = c10308e.vip[i2] >>> 3;
                AbstractC13532e abstractC13532e = (AbstractC13532e) c10308e.metrica[i2];
                int yandex = C5633e.yandex(8);
                int yandex2 = C5633e.yandex(i3) + C5633e.yandex(16);
                int yandex3 = C5633e.yandex(24);
                int startapp = abstractC13532e.startapp();
                i = AbstractC8703e.crashlytics(yandex + yandex, yandex2, AbstractC1414e.Signature(startapp, startapp, yandex3), i);
            }
            c10308e.license = i;
        }
        if (!this.metrica) {
            return i;
        }
        C15620e c15620e = ((AbstractC15267e) abstractC4291e).zzb.ad;
        int i4 = c15620e.f30806e;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += C6496e.startapp(c15620e.metrica(i6));
        }
        Iterator it = c15620e.ad().iterator();
        while (it.hasNext()) {
            i5 += C6496e.startapp((Map.Entry) it.next());
        }
        return i + i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC15433e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void license(java.lang.Object r11, byte[] r12, int r13, int r14, defpackage.C16807e r15) {
        /*
            r10 = this;
            r0 = r11
            eٗ٘ۚ r0 = (defpackage.AbstractC17076e) r0
            eَْٗ r1 = r0.zzc
            eَْٗ r2 = defpackage.C10308e.purchase
            if (r1 != r2) goto Lf
            eَْٗ r1 = defpackage.C10308e.vip()
            r0.zzc = r1
        Lf:
            r6 = r1
            eٕؗۙ r11 = (defpackage.AbstractC15267e) r11
            eؙٛؐ r0 = r11.zzb
            boolean r1 = r0.vip
            if (r1 == 0) goto L1e
            eؙٛؐ r0 = r0.clone()
            r11.zzb = r0
        L1e:
            r11 = 0
        L1f:
            if (r13 >= r14) goto La7
            int r4 = defpackage.AbstractC16653e.advert(r12, r13, r15)
            int r2 = r15.ad
            eِؗؔ r13 = r15.license
            r0 = 11
            eؖۖٔ r1 = r10.ad
            r3 = 2
            if (r2 == r0) goto L55
            r0 = r2 & 7
            if (r0 != r3) goto L4e
            int r0 = r2 >>> 3
            r13.getClass()
            eٌٕؔ r3 = new eٌٕؔ
            r3.<init>(r1, r0)
            java.util.Map r13 = r13.ad
            java.lang.Object r13 = r13.get(r3)
            eِٕۗ r13 = (defpackage.AbstractC15665e) r13
            r3 = r12
            r5 = r14
            r7 = r15
            int r13 = defpackage.AbstractC16653e.mopub(r2, r3, r4, r5, r6, r7)
            goto L1f
        L4e:
            r5 = r14
            r7 = r15
            int r13 = defpackage.AbstractC16653e.subscription(r2, r12, r4, r5, r7)
            goto L1f
        L55:
            r5 = r14
            r7 = r15
            r14 = 0
            r15 = r11
        L59:
            if (r4 >= r5) goto L9a
            int r0 = defpackage.AbstractC16653e.advert(r12, r4, r7)
            int r2 = r7.ad
            int r4 = r2 >>> 3
            r8 = r2 & 7
            if (r4 == r3) goto L76
            r9 = 3
            if (r4 == r9) goto L6b
            goto L8f
        L6b:
            if (r8 != r3) goto L8f
            int r4 = defpackage.AbstractC16653e.billing(r12, r0, r7)
            java.lang.Object r15 = r7.metrica
            eؙْ۟ r15 = (defpackage.AbstractC13532e) r15
            goto L59
        L76:
            if (r8 != 0) goto L8f
            int r4 = defpackage.AbstractC16653e.advert(r12, r0, r7)
            int r14 = r7.ad
            r13.getClass()
            eٌٕؔ r0 = new eٌٕؔ
            r0.<init>(r1, r14)
            java.util.Map r2 = r13.ad
            java.lang.Object r0 = r2.get(r0)
            eِٕۗ r0 = (defpackage.AbstractC15665e) r0
            goto L59
        L8f:
            r4 = 12
            if (r2 == r4) goto L98
            int r4 = defpackage.AbstractC16653e.subscription(r2, r12, r0, r5, r7)
            goto L59
        L98:
            r13 = r0
            goto L9b
        L9a:
            r13 = r4
        L9b:
            if (r15 == 0) goto La3
            int r14 = r14 << 3
            r14 = r14 | r3
            r6.metrica(r14, r15)
        La3:
            r14 = r5
            r15 = r7
            goto L1f
        La7:
            r5 = r14
            if (r13 != r5) goto Lab
            return
        Lab:
            eؘٚٔ r11 = new eؘٚٔ
            java.lang.String r12 = "Failed to parse the message."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1521e.license(java.lang.Object, byte[], int, int, eٗؗٙ):void");
    }

    @Override // defpackage.InterfaceC15433e
    public final boolean metrica(Object obj) {
        return ((AbstractC15267e) obj).zzb.purchase();
    }

    @Override // defpackage.InterfaceC15433e
    public final void purchase(Object obj, Object obj2) {
        AbstractC9415e.admob(obj, obj2);
        if (this.metrica) {
            C6607e c6607e = AbstractC10199e.ad;
            AbstractC9415e.Signature(obj, obj2);
        }
    }

    @Override // defpackage.InterfaceC15433e
    public final void startapp(Object obj, C17698e c17698e) {
        Iterator metrica = ((AbstractC15267e) obj).zzb.metrica();
        if (metrica.hasNext()) {
            ((AbstractC10814e) ((Map.Entry) metrica.next()).getKey()).getClass();
            throw null;
        }
        C10308e c10308e = ((AbstractC17076e) obj).zzc;
        for (int i = 0; i < c10308e.ad; i++) {
            int i2 = c10308e.vip[i] >>> 3;
            Object obj2 = c10308e.metrica[i];
            C5633e c5633e = c17698e.ad;
            if (obj2 instanceof AbstractC13532e) {
                c5633e.tapsense(11);
                c5633e.signatures(2, i2);
                c5633e.advert(3, (AbstractC13532e) obj2);
                c5633e.tapsense(12);
            } else {
                c5633e.tapsense(11);
                c5633e.signatures(2, i2);
                c5633e.tapsense(26);
                AbstractC17076e abstractC17076e = (AbstractC17076e) ((AbstractC4291e) obj2);
                c5633e.tapsense(abstractC17076e.metrica());
                abstractC17076e.advert(c5633e);
                c5633e.tapsense(12);
            }
        }
    }

    @Override // defpackage.InterfaceC15433e
    public final int vip(AbstractC17076e abstractC17076e) {
        int hashCode = abstractC17076e.zzc.hashCode();
        if (!this.metrica) {
            return hashCode;
        }
        return ((AbstractC15267e) abstractC17076e).zzb.ad.hashCode() + (hashCode * 53);
    }

    @Override // defpackage.InterfaceC15433e
    public final Object yandex() {
        AbstractC4291e abstractC4291e = this.ad;
        return abstractC4291e instanceof AbstractC17076e ? (AbstractC17076e) ((AbstractC17076e) abstractC4291e).smaato(4, null) : ((AbstractC15425e) ((AbstractC17076e) abstractC4291e).smaato(5, null)).license();
    }
}
