package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۢۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8294e {
    public static final Object ad = new Object();

    public static int ad(C16151e c16151e) {
        return ((c16151e.readByte() & 255) << 21) + ((c16151e.readByte() & 255) << 14) + ((c16151e.readByte() & 255) << 7) + (c16151e.readByte() & 255);
    }

    public static final long appmetrica(int i, byte[] bArr) {
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (r5.f24832e == 0) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object billing(defpackage.InterfaceC13033e r5, java.nio.ByteBuffer r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C4638e
            if (r0 == 0) goto L13
            r0 = r7
            eؗؕٚ r0 = (defpackage.C4638e) r0
            int r1 = r0.f9970e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9970e = r1
            goto L18
        L13:
            eؗؕٚ r0 = new eؗؕٚ
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f9971e
            int r1 = r0.f9970e
            r2 = -1
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2a
            java.nio.ByteBuffer r6 = r0.f9968e
            eْٕؕ r5 = r0.f9969e
            defpackage.AbstractC2003e.purchase(r7)
            goto L5c
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            defpackage.AbstractC2003e.purchase(r7)
            boolean r7 = r5.yandex()
            if (r7 == 0) goto L41
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r2)
            return r5
        L41:
            eَّۙ r7 = r5.billing()
            boolean r7 = r7.yandex()
            if (r7 == 0) goto L5c
            r0.f9969e = r5
            r0.f9968e = r6
            r0.f9970e = r3
            int r7 = defpackage.AbstractC4912e.ad
            java.lang.Object r7 = r5.license(r3, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r7 != r0) goto L5c
            return r0
        L5c:
            boolean r7 = r5.yandex()
            if (r7 == 0) goto L68
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r2)
            return r5
        L68:
            eَّۙ r5 = r5.billing()
            r5.getClass()
            long r0 = r5.f24832e
            r3 = 0
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 != 0) goto L83
            r0 = 8192(0x2000, double:4.0474E-320)
            r5.request(r0)
            long r0 = r5.f24832e
            int r7 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r7 != 0) goto L83
            goto Lc3
        L83:
            boolean r7 = r5.yandex()
            if (r7 == 0) goto L8a
            goto Lc3
        L8a:
            boolean r7 = r5.yandex()
            if (r7 != 0) goto Lc9
            eَؑٙ r7 = r5.f24834e
            byte[] r0 = r7.ad
            int r1 = r7.vip
            int r2 = r7.metrica
            int r3 = r6.remaining()
            int r2 = r2 - r1
            int r2 = java.lang.Math.min(r3, r2)
            r6.put(r0, r1, r2)
            if (r2 == 0) goto Lc3
            if (r2 < 0) goto Lbb
            int r6 = r7.vip()
            if (r2 > r6) goto Lb3
            long r6 = (long) r2
            r5.skip(r6)
            goto Lc3
        Lb3:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Returned too many bytes"
            r5.<init>(r6)
            throw r5
        Lbb:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Returned negative read bytes count"
            r5.<init>(r6)
            throw r5
        Lc3:
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r2)
            return r5
        Lc9:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Buffer is empty"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8294e.billing(eْٕؕ, java.nio.ByteBuffer, eُؑ۠):java.lang.Object");
    }

    public static final void license(long j, byte[] bArr, int i, int i2, int i3) {
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = AbstractC12368e.ad[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, eٟؑۢ] */
    /* JADX WARN: Type inference failed for: r10v15, types: [eَ٘ۖ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [eٍٖؐ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v62, types: [eؒؔۙ, eؑۖۜ, eٌٕ۠] */
    /* JADX WARN: Type inference failed for: r2v63, types: [eؒؔۙ, eٔ۠۟, eٌٕ۠] */
    /* JADX WARN: Type inference failed for: r3v55, types: [eؒؔۙ, eٌٕ۠, eٓٚؗ] */
    public static AbstractC9027e metrica(C7179e c7179e) {
        C0957e c0957e;
        if (c7179e == null) {
            throw new IllegalArgumentException("keyInfo array null");
        }
        isPro ispro = c7179e.f14670e;
        C16527e c16527e = c7179e.f14672e;
        Ctry ctry = c16527e.f32408e;
        subs subsVar = c16527e.f32407e;
        if (ctry.isVip(InterfaceC3408e.ad)) {
            return new C2185e(AbstractC12348e.appmetrica(C11717e.loadAd(subsVar)), Cprotected.subs(c7179e.admob()).f36449e);
        }
        if (ctry.isVip(InterfaceC3408e.vip)) {
            byte[] bArr = Cprotected.subs(c7179e.admob()).f36449e;
            int length = bArr.length / 2;
            short[] sArr = new short[length];
            for (int i = 0; i != length; i++) {
                int i2 = i * 2;
                sArr[i] = (short) (((bArr[i2 + 1] & 255) << 8) | (bArr[i2] & 255));
            }
            return new C0901e(sArr);
        }
        C0648e c0648e = null;
        r10 = null;
        Cprotected cprotected = null;
        r10 = null;
        Cprotected cprotected2 = null;
        C10334e c10334e = null;
        C0957e c0957e2 = null;
        if (ctry.isVip(InterfaceC5051e.f10810e)) {
            Cprotected Signature = c7179e.Signature();
            byte[] bArr2 = Signature.f36449e;
            if (bArr2.length != 64) {
                if (!AbstractC12348e.vip(bArr2) && bArr2[0] == 4) {
                    cprotected = Cprotected.subs(bArr2);
                }
                if (cprotected != null) {
                    Signature = Cprotected.subs(cprotected);
                }
            }
            byte[] bArr3 = Signature.f36449e;
            if (ispro == null) {
                return C1347e.vip(AbstractC12442e.admob(4, bArr3.length, bArr3));
            }
            byte[] m4602class = ispro.m4602class();
            C1347e vip = C1347e.vip(AbstractC12442e.admob(4, bArr3.length, bArr3));
            C3100e.ad(m4602class);
            vip.getClass();
            return vip;
        }
        if (ctry.m4675native(InterfaceC18291e.adcel) || ctry.m4675native(InterfaceC18291e.f35762catch)) {
            C7942e c7942e = (C7942e) AbstractC12348e.Signature.get(ctry);
            Cdefault admob = c7179e.admob();
            if (!(admob instanceof Ccatch)) {
                return new C9974e(c7942e, Cprotected.subs(admob).f36449e);
            }
            Ccatch m168class = Ccatch.m168class(admob);
            ?? obj = new Object();
            int m4666native = Cthis.subs(m168class.mo171interface(0)).m4666native();
            obj.f18338e = m4666native;
            if (m4666native != 0) {
                throw new IllegalArgumentException("unrecognized version");
            }
            obj.f18336e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(1)).f36449e);
            obj.f18335e = AbstractC12442e.license(Cprotected.subs(m168class.mo171interface(2)).f36449e);
            if (m168class.size() == 4) {
                subs mo171interface = m168class.mo171interface(3);
                if (mo171interface instanceof C0648e) {
                    c0648e = (C0648e) mo171interface;
                } else if (mo171interface != null) {
                    Ccatch m168class2 = Ccatch.m168class(mo171interface);
                    ?? obj2 = new Object();
                    obj2.f2904e = AbstractC12442e.license(Cprotected.subs(m168class2.mo171interface(0)).f36449e);
                    obj2.f2903e = AbstractC12442e.license(Cprotected.subs(m168class2.mo171interface(1)).f36449e);
                    c0648e = obj2;
                }
                obj.f18337e = c0648e;
            }
            C0648e c0648e2 = obj.f18337e;
            return new C9974e(c7942e, AbstractC12442e.license(obj.f18336e), AbstractC12442e.license(obj.f18335e), AbstractC12442e.license(c0648e2.f2904e), AbstractC12442e.license(c0648e2.f2903e));
        }
        HashMap hashMap = AbstractC12348e.f24771throw;
        if (hashMap.containsKey(ctry)) {
            C4577e c4577e = (C4577e) hashMap.get(ctry);
            Cprotected Signature2 = c7179e.Signature();
            int metrica = c4577e.vip.metrica() * 4;
            byte[] bArr4 = Signature2.f36449e;
            if (bArr4.length != metrica) {
                if (!AbstractC12348e.vip(bArr4) && bArr4[0] == 4) {
                    cprotected2 = Cprotected.subs(bArr4);
                }
                if (cprotected2 != null) {
                    Signature2 = Cprotected.subs(cprotected2);
                }
            }
            return new C12222e(c4577e, Signature2.f36449e);
        }
        if (ctry.m4675native(InterfaceC18291e.f35767else)) {
            return new C10052e((C6000e) AbstractC12348e.yandex.get(ctry), Cprotected.subs(c7179e.admob()).f36449e);
        }
        if (ctry.m4675native(InterfaceC18291e.f35841e)) {
            Cdefault admob2 = c7179e.admob();
            if (admob2 != null) {
                Ccatch m168class3 = Ccatch.m168class(admob2);
                ?? obj3 = new Object();
                int m4666native2 = Cthis.subs(m168class3.mo171interface(0)).m4666native();
                obj3.f20395e = m4666native2;
                if (m4666native2 != 0) {
                    throw new IllegalArgumentException("unrecognized version");
                }
                obj3.f20393e = AbstractC12442e.license(Cprotected.subs(m168class3.mo171interface(1)).f36449e);
                obj3.f20392e = AbstractC12442e.license(Cprotected.subs(m168class3.mo171interface(2)).f36449e);
                obj3.f20394e = AbstractC12442e.license(Cprotected.subs(m168class3.mo171interface(3)).f36449e);
                obj3.f20391e = AbstractC12442e.license(Cprotected.subs(m168class3.mo171interface(4)).f36449e);
                obj3.f20397e = AbstractC12442e.license(Cprotected.subs(m168class3.mo171interface(5)).f36449e);
                c10334e = obj3;
                if (m168class3.size() == 7) {
                    obj3.f20396e = C5473e.loadAd(m168class3.mo171interface(6));
                    c10334e = obj3;
                }
            }
            return new C7432e((C16331e) AbstractC12348e.amazon.get(ctry), AbstractC12442e.license(c10334e.f20393e), AbstractC12442e.license(c10334e.f20392e), AbstractC12442e.license(c10334e.f20394e), AbstractC12442e.license(c10334e.f20391e), AbstractC12442e.license(c10334e.f20397e));
        }
        if (ctry.m4675native(InterfaceC18291e.f35884e)) {
            byte[] bArr5 = Cprotected.subs(c7179e.admob()).f36449e;
            ?? abstractC0821e = new AbstractC0821e(AbstractC12348e.adcel.get(ctry), true);
            abstractC0821e.f29783e = AbstractC12442e.license(bArr5);
            return abstractC0821e;
        }
        if (ctry.m4675native(InterfaceC18291e.f35793e)) {
            byte[] bArr6 = Cprotected.subs(c7179e.admob()).f36449e;
            ?? abstractC0821e2 = new AbstractC0821e(AbstractC12348e.advert.get(ctry), true);
            abstractC0821e2.f2568e = AbstractC12442e.license(bArr6);
            return abstractC0821e2;
        }
        if (ctry.m4675native(InterfaceC18291e.f35807e)) {
            return new C5351e((C13948e) AbstractC12348e.subscription.get(ctry), Cprotected.subs(c7179e.admob()).f36449e);
        }
        if (ctry.isVip(InterfaceC0760e.f3085e) || ctry.isVip(InterfaceC0760e.f3062e) || ctry.isVip(InterfaceC0760e.f3075e)) {
            C12241e Signature3 = c7179e.Signature();
            byte[] bArr7 = Signature3.f36449e;
            Object obj4 = Signature3;
            if (bArr7.length != 64) {
                Cdefault metrica2 = AbstractC12348e.metrica(bArr7);
                if (metrica2 instanceof Cprotected) {
                    obj4 = Cprotected.subs(metrica2);
                } else {
                    obj4 = Signature3;
                    if (metrica2 instanceof Ccatch) {
                        obj4 = Ccatch.m168class(metrica2);
                    }
                }
            }
            C12532e c12532e = (C12532e) AbstractC12348e.f24766goto.get(ctry);
            if (ispro != null) {
                try {
                    Cdefault inmobi = Cdefault.inmobi(ispro.m4602class());
                    if (inmobi instanceof Ccatch) {
                        Ccatch m168class4 = Ccatch.m168class(inmobi);
                        c0957e = new C0957e(c12532e, Cprotected.subs(m168class4.mo171interface(0)).f36449e, Cprotected.subs(m168class4.mo171interface(1)).f36449e);
                    } else {
                        c0957e = new C0957e(c12532e, Cprotected.subs(inmobi).f36449e);
                    }
                    c0957e2 = c0957e;
                } catch (Exception unused) {
                    c0957e2 = new C0957e(c12532e, ispro.m4602class());
                }
            }
            if (obj4 instanceof Cprotected) {
                return new C1364e(c12532e, ((Cprotected) obj4).f36449e, c0957e2);
            }
            if (!(obj4 instanceof Ccatch)) {
                throw new IllegalArgumentException(AbstractC1786e.signatures(new StringBuilder("invalid "), c12532e.f25095e, " private key"));
            }
            Ccatch ccatch = (Ccatch) obj4;
            byte[] bArr8 = Cprotected.subs(ccatch.mo171interface(0)).f36449e;
            byte[] bArr9 = Cprotected.subs(ccatch.mo171interface(1)).f36449e;
            C1364e c1364e = new C1364e(c12532e, bArr8, c0957e2);
            if (AbstractC12442e.loadAd(c1364e.getEncoded(), bArr9)) {
                return c1364e;
            }
            throw new IllegalArgumentException(AbstractC1786e.signatures(new StringBuilder("inconsistent "), c12532e.f25095e, " private key"));
        }
        if (ctry.m4675native(InterfaceC18291e.f35815e)) {
            Ccatch m168class5 = Ccatch.m168class(c7179e.admob());
            return new C10714e((C16449e) AbstractC12348e.tapsense.get(ctry), Cprotected.subs(m168class5.mo171interface(0)).f36449e, Cprotected.subs(m168class5.mo171interface(1)).f36449e, Cprotected.subs(m168class5.mo171interface(2)).f36449e, Cprotected.subs(m168class5.mo171interface(3)).f36449e);
        }
        if (ctry.m4675native(InterfaceC18291e.f35827e)) {
            Ccatch m168class6 = Ccatch.m168class(c7179e.admob());
            return new C6635e((C11526e) AbstractC12348e.inmobi.get(ctry), Cprotected.subs(m168class6.mo171interface(0)).f36449e, Cprotected.subs(m168class6.mo171interface(1)).f36449e, Cprotected.subs(m168class6.mo171interface(2)).f36449e, Cprotected.subs(m168class6.mo171interface(3)).f36449e, Cprotected.subs(m168class6.mo171interface(4)).f36449e);
        }
        HashMap hashMap2 = AbstractC12348e.f24768native;
        if (hashMap2.containsKey(ctry)) {
            C12241e Signature4 = c7179e.Signature();
            byte[] bArr10 = Signature4.f36449e;
            Object obj5 = Signature4;
            if (bArr10.length != 32) {
                Cdefault metrica3 = AbstractC12348e.metrica(bArr10);
                if (metrica3 instanceof Cprotected) {
                    obj5 = Cprotected.subs(metrica3);
                } else {
                    obj5 = Signature4;
                    if (metrica3 instanceof Ccatch) {
                        obj5 = Ccatch.m168class(metrica3);
                    }
                }
            }
            C3456e c3456e = (C3456e) hashMap2.get(ctry);
            C15968e vip2 = ispro != null ? C2222e.vip(c3456e, ispro) : null;
            if (obj5 instanceof Cprotected) {
                return new C13252e(c3456e, ((Cprotected) obj5).f36449e, vip2);
            }
            if (!(obj5 instanceof Ccatch)) {
                throw new IllegalArgumentException(AbstractC1786e.signatures(new StringBuilder("invalid "), c3456e.vip, " private key"));
            }
            Ccatch ccatch2 = (Ccatch) obj5;
            byte[] bArr11 = Cprotected.subs(ccatch2.mo171interface(0)).f36449e;
            byte[] bArr12 = Cprotected.subs(ccatch2.mo171interface(1)).f36449e;
            C13252e c13252e = new C13252e(c3456e, bArr11, vip2);
            if (AbstractC12442e.loadAd(c13252e.getEncoded(), bArr12)) {
                return c13252e;
            }
            throw new IllegalArgumentException(AbstractC1786e.signatures(new StringBuilder("inconsistent "), c3456e.vip, " private key"));
        }
        if (ctry.isVip(InterfaceC18291e.f35812e) || ctry.isVip(InterfaceC18291e.f35871e) || ctry.isVip(InterfaceC18291e.f35784e)) {
            Cdefault admob3 = c7179e.admob();
            C0838e c0838e = (C0838e) AbstractC12348e.applovin.get(ctry);
            if (!(admob3 instanceof Ccatch)) {
                if (!(admob3 instanceof C12241e)) {
                    throw new IOException("not supported");
                }
                byte[] bArr13 = Cprotected.subs(admob3).f36449e;
                return ispro != null ? new C11035e(c0838e, bArr13, C2222e.ad(c0838e, ispro)) : new C11035e(c0838e, bArr13, null);
            }
            Ccatch m168class7 = Ccatch.m168class(admob3);
            int m4666native3 = Cthis.subs(m168class7.mo171interface(0)).m4666native();
            if (m4666native3 != 0) {
                throw new IOException(AbstractC1786e.admob(m4666native3, "unknown private key version: "));
            }
            if (ispro != null) {
                return new C11035e(c0838e, isPro.firebase(m168class7.mo171interface(1)).m4602class(), isPro.firebase(m168class7.mo171interface(2)).m4602class(), isPro.firebase(m168class7.mo171interface(3)).m4602class(), isPro.firebase(m168class7.mo171interface(4)).m4602class(), isPro.firebase(m168class7.mo171interface(5)).m4602class(), isPro.firebase(m168class7.mo171interface(6)).m4602class(), AbstractC12442e.license(C2222e.ad(c0838e, ispro).f33399e));
            }
            return new C11035e(c0838e, isPro.firebase(m168class7.mo171interface(1)).m4602class(), isPro.firebase(m168class7.mo171interface(2)).m4602class(), isPro.firebase(m168class7.mo171interface(3)).m4602class(), isPro.firebase(m168class7.mo171interface(4)).m4602class(), isPro.firebase(m168class7.mo171interface(5)).m4602class(), isPro.firebase(m168class7.mo171interface(6)).m4602class(), null);
        }
        if (ctry.isVip(InterfaceC18291e.f35874e) || ctry.isVip(InterfaceC18291e.f35899e)) {
            C11480e loadAd = C11480e.loadAd(c7179e.admob());
            return new C5858e((C4113e) AbstractC12348e.pro.get(ctry), AbstractC12442e.license(loadAd.f23086e), AbstractC12442e.license(loadAd.f23085e), AbstractC12442e.license(loadAd.f23087e), loadAd.f23084e.f25683e);
        }
        if (ctry.isVip(InterfaceC18291e.f35844e) || ctry.isVip(InterfaceC18291e.f35803e)) {
            C11480e loadAd2 = C11480e.loadAd(c7179e.admob());
            return new C5858e((C4113e) AbstractC12348e.pro.get(ctry), AbstractC12442e.license(loadAd2.f23086e), AbstractC12442e.license(loadAd2.f23085e), AbstractC12442e.license(loadAd2.f23087e), loadAd2.f23084e.f25683e);
        }
        if (ctry.m4675native(InterfaceC18291e.f35861e)) {
            byte[] bArr14 = Cprotected.subs(c7179e.admob()).f36449e;
            C5539e c5539e = (C5539e) AbstractC12348e.premium.get(ctry);
            int i3 = c5539e.f11859e;
            int i4 = c5539e.f11859e;
            byte[] admob4 = AbstractC12442e.admob(0, (i3 + 7) / 8, bArr14);
            byte[] admob5 = AbstractC12442e.admob((i4 + 7) / 8, ((i4 + 7) / 8) * 2, bArr14);
            byte[] admob6 = AbstractC12442e.admob(((i4 + 7) / 8) * 2, bArr14.length, bArr14);
            ?? abstractC0821e3 = new AbstractC0821e((Object) c5539e, true);
            abstractC0821e3.f27823e = AbstractC12442e.license(admob4);
            abstractC0821e3.f27824e = AbstractC12442e.license(admob5);
            abstractC0821e3.f27822e = AbstractC12442e.license(admob6);
            return abstractC0821e3;
        }
        if (ctry.m4675native(InterfaceC18291e.f35904e)) {
            return new C13865e((C7795e) AbstractC12348e.crashlytics.get(ctry), Cprotected.subs(c7179e.admob()).f36449e);
        }
        if (ctry.m4675native(InterfaceC18291e.f35783e)) {
            return new C12422e((C12048e) AbstractC12348e.f24764class.get(ctry), Cprotected.subs(c7179e.admob()).f36449e);
        }
        if (ctry.isVip(InterfaceC3408e.metrica)) {
            C10285e loadAd3 = C10285e.loadAd(subsVar);
            Ctry ctry2 = loadAd3.f20301e.f32408e;
            Cdefault admob7 = c7179e.admob();
            C4012e c4012e = admob7 != null ? new C4012e(Ccatch.m168class(admob7)) : null;
            try {
                C13798e c13798e = new C13798e(new C0368e(loadAd3.f20302e, AbstractC12348e.ad(ctry2)));
                int i5 = c4012e.f8930e;
                byte[] bArr15 = c4012e.f8931e;
                c13798e.f27350e = i5;
                c13798e.f27346e = AbstractC16947e.license(AbstractC12442e.license(c4012e.f8929e));
                c13798e.f27349e = AbstractC16947e.license(AbstractC12442e.license(c4012e.f8932e));
                c13798e.f27352e = AbstractC16947e.license(AbstractC12442e.license(c4012e.f8928e));
                c13798e.f27351e = AbstractC16947e.license(AbstractC12442e.license(c4012e.f8935e));
                if (c4012e.f8933e != 0) {
                    c13798e.f27347e = c4012e.f8934e;
                }
                if (AbstractC12442e.license(bArr15) != null) {
                    C9648e c9648e = (C9648e) AbstractC16947e.billing(AbstractC12442e.license(bArr15), C9648e.class);
                    c9648e.getClass();
                    c13798e.f27348e = new C9648e(c9648e, ctry2);
                }
                return new C2047e(c13798e);
            } catch (ClassNotFoundException e) {
                throw new IOException("ClassNotFoundException processing BDS state: " + e.getMessage());
            }
        }
        if (!ctry.isVip(InterfaceC3408e.license)) {
            if (ctry.m4675native(InterfaceC18291e.f35880e)) {
                return new C0625e((C10280e) AbstractC12348e.f24772try.get(ctry), Cprotected.subs(c7179e.admob()).f36449e);
            }
            if (ctry.m4675native(InterfaceC18291e.f35795e)) {
                return new C1463e((C3763e) AbstractC12348e.f24763break.get(ctry), Cprotected.subs(c7179e.admob()).f36449e);
            }
            throw new RuntimeException("algorithm identifier in private key not recognised");
        }
        C17299e loadAd4 = C17299e.loadAd(subsVar);
        Ctry ctry3 = loadAd4.f33943e.f32408e;
        try {
            Cdefault admob8 = c7179e.admob();
            C6994e c6994e = admob8 != null ? new C6994e(Ccatch.m168class(admob8)) : null;
            int i6 = loadAd4.f33942e;
            C5214e c5214e = new C5214e(new C13719e(i6, loadAd4.f33941e, AbstractC12348e.ad(ctry3)));
            long j = c6994e.f14320e;
            byte[] bArr16 = c6994e.f14321e;
            c5214e.vip = j;
            c5214e.license = AbstractC16947e.license(AbstractC12442e.license(c6994e.f14322e));
            c5214e.appmetrica = AbstractC16947e.license(AbstractC12442e.license(c6994e.f14318e));
            c5214e.purchase = AbstractC16947e.license(AbstractC12442e.license(c6994e.f14325e));
            c5214e.billing = AbstractC16947e.license(AbstractC12442e.license(c6994e.f14324e));
            if (c6994e.f14323e != 0) {
                c5214e.metrica = c6994e.f14319e;
            }
            if (AbstractC12442e.license(bArr16) != null) {
                C3607e ad2 = ((C3607e) AbstractC16947e.billing(AbstractC12442e.license(bArr16), C3607e.class)).ad(ctry3);
                if (ad2.f8136e == 0) {
                    c5214e.yandex = new C3607e(ad2, (1 << i6) - 1);
                } else {
                    c5214e.yandex = ad2;
                }
            }
            return new C7770e(c5214e);
        } catch (ClassNotFoundException e2) {
            throw new IOException("ClassNotFoundException processing BDS state: " + e2.getMessage());
        }
    }

    public static boolean purchase(byte[] bArr) {
        for (byte b : bArr) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }

    public static byte[] startapp(int i) {
        return new byte[]{(byte) ((266338304 & i) >> 21), (byte) ((2080768 & i) >> 14), (byte) ((i & 16256) >> 7), (byte) (i & 127)};
    }

    public static int vip(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[4];
        byteBuffer.get(bArr, 0, 4);
        return ((bArr[0] & 255) << 21) + ((bArr[1] & 255) << 14) + ((bArr[2] & 255) << 7) + (bArr[3] & 255);
    }

    public static final void yandex(String str, int i, String str2) {
        StringBuilder smaato = AbstractC10257e.smaato("Expected ", str2, " at index ", i, ", but was '");
        smaato.append(str.charAt(i));
        smaato.append('\'');
        throw new IllegalArgumentException(smaato.toString());
    }
}
