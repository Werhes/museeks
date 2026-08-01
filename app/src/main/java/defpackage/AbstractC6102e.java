package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؐ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6102e extends AbstractC6126e implements InterfaceC4890e, InterfaceC13409e, InterfaceC17453e, InterfaceC6459e, InterfaceC1683e, InterfaceC0479e, InterfaceC1946e, InterfaceC2998e {

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public static final C17354e f12787e = new C17354e(22);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C11796e f12788e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public InterfaceC17220e f12789e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public C17612e f12790e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public final C16529e f12791e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C15274e f12792e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public C8419e f12793e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public C1639e f12794e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public C5943e f12795e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public InterfaceC5077e f12796e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public InterfaceC17220e f12797e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public boolean f12798e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public long f12799e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public boolean f12800e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public C17612e f12801e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f12802e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public C15274e f12803e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public Function0 f12804e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C15108e f12805e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public final C17354e f12806e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public String f12807e;

    public AbstractC6102e(C15274e c15274e, InterfaceC17220e interfaceC17220e, boolean z, boolean z2, String str, C11796e c11796e, Function0 function0) {
        this.f12792e = c15274e;
        this.f12789e = interfaceC17220e;
        this.f12802e = z;
        this.f12807e = str;
        this.f12788e = c11796e;
        this.f12798e = z2;
        this.f12804e = function0;
        this.f12805e = new C15108e(c15274e, 0, new C0638e(1, this, AbstractC6102e.class, "onFocusChange", "onFocusChange(Z)V", 0, 0, 13));
        C16529e c16529e = AbstractC2800e.ad;
        this.f12791e = new C16529e();
        this.f12799e = 0L;
        C15274e c15274e2 = this.f12792e;
        this.f12803e = c15274e2;
        this.f12800e = c15274e2 == null;
        this.f12806e = f12787e;
    }

    @Override // defpackage.InterfaceC17453e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
        C11796e c11796e = this.f12788e;
        if (c11796e != null) {
            AbstractC14594e.advert(interfaceC15671e, c11796e.ad);
        }
        String str = this.f12807e;
        C3871e c3871e = new C3871e(this, 1);
        InterfaceC8614e[] interfaceC8614eArr = AbstractC14594e.ad;
        interfaceC15671e.appmetrica(AbstractC10789e.vip, new C10591e(str, c3871e));
        if (this.f12798e) {
            this.f12805e.adcel(interfaceC15671e);
        } else {
            AbstractC14594e.ad(interfaceC15671e);
        }
        mo860e(interfaceC15671e);
    }

    @Override // defpackage.InterfaceC6459e
    public final Object admob() {
        return this.f12806e;
    }

    @Override // defpackage.InterfaceC13409e
    public final boolean amazon(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: break */
    public final /* synthetic */ boolean mo358break() {
        return false;
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: catch */
    public final /* synthetic */ void mo708catch() {
    }

    @Override // defpackage.InterfaceC4890e
    public void crashlytics(C2561e c2561e, EnumC13456e enumC13456e, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.f12799e = (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        m2023e();
        if (this.f12798e) {
            if (this.f12795e == null) {
                C5943e c5943e = new C5943e(this);
                m2050e(c5943e);
                this.f12795e = c5943e;
            }
            if (enumC13456e == EnumC13456e.f26727e) {
                int i = c2561e.purchase;
                InterfaceC5083e interfaceC5083e = null;
                if (i == 4) {
                    AbstractC5336e.purchase(m3623e(), null, 0, new C11723e(this, interfaceC5083e, 0), 3);
                } else if (i == 5) {
                    AbstractC5336e.purchase(m3623e(), null, 0, new C11723e(this, interfaceC5083e, 1), 3);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: eؒۖۗ */
    public final boolean mo359e() {
        return true;
    }

    /* renamed from: eّؔٞ, reason: contains not printable characters */
    public abstract void mo2022e(KeyEvent keyEvent);

    /* renamed from: eِؕٛ, reason: contains not printable characters */
    public final void m2023e() {
        if (this.f12796e != null) {
            return;
        }
        InterfaceC17220e interfaceC17220e = this.f12802e ? this.f12797e : this.f12789e;
        if (interfaceC17220e != null) {
            if (this.f12792e == null) {
                this.f12792e = new C15274e();
            }
            this.f12805e.m3920e(this.f12792e);
            InterfaceC5077e vip = interfaceC17220e.vip(this.f12792e);
            m2050e(vip);
            this.f12796e = vip;
        }
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: eؘُٔ */
    public final void mo709e() {
        mo720protected();
    }

    /* renamed from: eٍؙّ, reason: contains not printable characters */
    public abstract boolean mo2024e(KeyEvent keyEvent);

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    public final void m2025e() {
        C15274e c15274e = this.f12792e;
        C16529e c16529e = this.f12791e;
        if (c15274e != null) {
            C17612e c17612e = this.f12801e;
            if (c17612e != null) {
                c15274e.vip(new C1867e(c17612e));
            }
            C17612e c17612e2 = this.f12790e;
            if (c17612e2 != null) {
                c15274e.vip(new C1867e(c17612e2));
            }
            C1639e c1639e = this.f12794e;
            if (c1639e != null) {
                c15274e.vip(new C5754e(c1639e));
            }
            Object[] objArr = c16529e.metrica;
            long[] jArr = c16529e.ad;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                c15274e.vip(new C1867e((C17612e) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.f12801e = null;
        this.f12790e = null;
        this.f12794e = null;
        c16529e.ad();
    }

    /* renamed from: eٌؙٞ, reason: contains not printable characters */
    public void mo2026e() {
    }

    /* renamed from: eٌۘۤ, reason: contains not printable characters */
    public final void m2027e(long j, boolean z) {
        C15274e c15274e = this.f12792e;
        if (c15274e != null) {
            C8419e c8419e = this.f12793e;
            if (c8419e == null || !c8419e.purchase()) {
                C17612e c17612e = z ? this.f12790e : this.f12801e;
                if (c17612e != null) {
                    AbstractC5336e.purchase(m3623e(), null, 0, new C5292e(c17612e, c15274e, null), 3);
                }
            } else {
                c8419e.Signature(null);
                AbstractC5336e.purchase(m3623e(), null, 0, new C5840e(c8419e, j, c15274e, (InterfaceC5083e) null, 0), 3);
            }
            if (z) {
                this.f12790e = null;
            } else {
                this.f12801e = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍؚؔ, java.lang.Object] */
    /* renamed from: eٍؓۙ, reason: contains not printable characters */
    public final void m2028e(C3189e c3189e) {
        C15274e c15274e = this.f12792e;
        if (c15274e != null) {
            C17612e c17612e = new C17612e(c3189e.metrica);
            ?? obj = new Object();
            AbstractC14114e.yandex(this, C5943e.f12526e, new C2046e(4, new C9041e(c3189e, (Object) obj, 0)));
            InterfaceC5083e interfaceC5083e = null;
            if (obj.f18534e || AbstractC8049e.ad(this)) {
                this.f12793e = AbstractC5336e.purchase(m3623e(), null, 0, new C16026e(c15274e, c17612e, this, interfaceC5083e, 0), 3);
            } else {
                this.f12790e = c17612e;
                AbstractC5336e.purchase(m3623e(), null, 0, new C5292e(c15274e, c17612e, interfaceC5083e, 1), 3);
            }
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eُۘٙ */
    public final void mo713e() {
        mo720protected();
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        m2025e();
        if (this.f12803e == null) {
            this.f12792e = null;
        }
        InterfaceC5077e interfaceC5077e = this.f12796e;
        if (interfaceC5077e != null) {
            m2042e(interfaceC5077e);
        }
        this.f12796e = null;
        C5943e c5943e = this.f12795e;
        if (c5943e != null) {
            m2042e(c5943e);
        }
        this.f12795e = null;
    }

    /* renamed from: eًْٕ, reason: contains not printable characters */
    public final long m2029e(long j) {
        long mo494e = AbstractC5851e.mopub(this).f27604e.mo494e(((InterfaceC11678e) AbstractC10432e.vip(this, AbstractC11473e.pro)).license());
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (mo494e >> 32)) - ((int) (j >> 32))) / 2.0f;
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (mo494e & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(max2) & 4294967295L) | (Float.floatToRawIntBits(max) << 32);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍؚؔ, java.lang.Object] */
    /* renamed from: eٔؖۘ, reason: contains not printable characters */
    public final void m2030e(C2401e c2401e) {
        C15274e c15274e = this.f12792e;
        if (c15274e != null) {
            C17612e c17612e = new C17612e(c2401e.metrica);
            ?? obj = new Object();
            AbstractC14114e.yandex(this, C5943e.f12526e, new C2046e(4, new C9041e(c2401e, (Object) obj, 1)));
            InterfaceC5083e interfaceC5083e = null;
            if (obj.f18534e || AbstractC8049e.ad(this)) {
                this.f12793e = AbstractC5336e.purchase(m3623e(), null, 0, new C16026e(c15274e, c17612e, this, interfaceC5083e, 1), 3);
            } else {
                this.f12801e = c17612e;
                AbstractC5336e.purchase(m3623e(), null, 0, new C5292e(c15274e, c17612e, interfaceC5083e, 2), 3);
            }
        }
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: eّٔؖ */
    public final /* synthetic */ boolean mo716e() {
        return false;
    }

    /* renamed from: eٕٙؗ, reason: contains not printable characters */
    public final void m2031e(boolean z) {
        C15274e c15274e = this.f12792e;
        if (c15274e != null) {
            C8419e c8419e = this.f12793e;
            InterfaceC5083e interfaceC5083e = null;
            if (c8419e == null || !c8419e.purchase()) {
                C17612e c17612e = z ? this.f12790e : this.f12801e;
                if (c17612e != null) {
                    C1867e c1867e = new C1867e(c17612e);
                    InterfaceC10500e interfaceC10500e = (InterfaceC10500e) ((C14826e) m3623e()).f29359e.mo397public(C4524e.f9798e);
                    AbstractC5336e.purchase(m3623e(), null, 0, new C14869e(c15274e, c1867e, interfaceC10500e != null ? interfaceC10500e.mo692else(new C12439e(c15274e, c1867e, 3)) : null, interfaceC5083e, 0), 3);
                }
            } else {
                C8419e c8419e2 = this.f12793e;
                if (c8419e2 != null) {
                    c8419e2.Signature(null);
                }
            }
            if (z) {
                this.f12790e = null;
            } else {
                this.f12801e = null;
            }
        }
    }

    /* renamed from: eٖٔۧ */
    public void mo860e(InterfaceC15671e interfaceC15671e) {
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        mo343for();
        if (!this.f12800e) {
            m2023e();
        }
        if (this.f12798e) {
            m2050e(this.f12805e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        if (r3.f12796e == null) goto L40;
     */
    /* renamed from: e۠۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2032e(defpackage.C15274e r4, defpackage.InterfaceC17220e r5, boolean r6, boolean r7, java.lang.String r8, defpackage.C11796e r9, kotlin.jvm.functions.Function0 r10) {
        /*
            r3 = this;
            eؘٕؕ r0 = r3.f12803e
            boolean r0 = defpackage.AbstractC7890e.billing(r0, r4)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L13
            r3.m2025e()
            r3.f12803e = r4
            r3.f12792e = r4
            r4 = r1
            goto L14
        L13:
            r4 = r2
        L14:
            eٕٗۘ r0 = r3.f12789e
            boolean r0 = defpackage.AbstractC7890e.billing(r0, r5)
            if (r0 != 0) goto L1f
            r3.f12789e = r5
            r4 = r1
        L1f:
            boolean r5 = r3.f12802e
            if (r5 == r6) goto L2b
            r3.f12802e = r6
            if (r6 == 0) goto L2a
            r3.mo343for()
        L2a:
            r4 = r1
        L2b:
            boolean r5 = r3.f12798e
            eٔۦۡ r6 = r3.f12805e
            if (r5 == r7) goto L42
            if (r7 == 0) goto L37
            r3.m2050e(r6)
            goto L3d
        L37:
            r3.m2042e(r6)
            r3.m2025e()
        L3d:
            defpackage.AbstractC15118e.appmetrica(r3)
            r3.f12798e = r7
        L42:
            java.lang.String r5 = r3.f12807e
            boolean r5 = defpackage.AbstractC7890e.billing(r5, r8)
            if (r5 != 0) goto L4f
            r3.f12807e = r8
            defpackage.AbstractC15118e.appmetrica(r3)
        L4f:
            eٌِ٘ r5 = r3.f12788e
            boolean r5 = defpackage.AbstractC7890e.billing(r5, r9)
            if (r5 != 0) goto L5c
            r3.f12788e = r9
            defpackage.AbstractC15118e.appmetrica(r3)
        L5c:
            r3.f12804e = r10
            boolean r5 = r3.f12800e
            eؘٕؕ r7 = r3.f12803e
            if (r7 != 0) goto L66
            r8 = r1
            goto L67
        L66:
            r8 = r2
        L67:
            if (r5 == r8) goto L75
            if (r7 != 0) goto L6c
            r2 = r1
        L6c:
            r3.f12800e = r2
            if (r2 != 0) goto L75
            eٟؗۡ r5 = r3.f12796e
            if (r5 != 0) goto L75
            goto L76
        L75:
            r1 = r4
        L76:
            if (r1 == 0) goto L8b
            eٟؗۡ r4 = r3.f12796e
            if (r4 != 0) goto L80
            boolean r5 = r3.f12800e
            if (r5 != 0) goto L8b
        L80:
            if (r4 == 0) goto L85
            r3.m2042e(r4)
        L85:
            r4 = 0
            r3.f12796e = r4
            r3.m2023e()
        L8b:
            eؘٕؕ r4 = r3.f12792e
            r6.m3920e(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6102e.m2032e(eؘٕؕ, eٕٗۘ, boolean, boolean, java.lang.String, eٌِ٘, kotlin.jvm.functions.Function0):void");
    }

    @Override // defpackage.InterfaceC0479e
    /* renamed from: for */
    public final void mo343for() {
        if (this.f12802e) {
            AbstractC16425e.purchase(this, new C3871e(this, 0));
        }
    }

    @Override // defpackage.InterfaceC2998e
    /* renamed from: interface */
    public final /* synthetic */ boolean mo1226interface(C3189e c3189e) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079 A[RETURN] */
    @Override // defpackage.InterfaceC13409e
    /* renamed from: native */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo719native(android.view.KeyEvent r11) {
        /*
            r10 = this;
            r10.m2023e()
            long r0 = defpackage.AbstractC9835e.startapp(r11)
            boolean r2 = r10.f12798e
            r3 = 3
            r4 = 0
            eؘٖ۟ r5 = r10.f12791e
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4b
            int r2 = defpackage.AbstractC9835e.adcel(r11)
            r8 = 2
            if (r2 != r8) goto L4b
            boolean r2 = defpackage.AbstractC9546e.Signature(r11)
            if (r2 == 0) goto L4b
            boolean r2 = r5.vip(r0)
            if (r2 != 0) goto L41
            eٍؚ٘ r2 = new eٍؚ٘
            long r8 = r10.f12799e
            r2.<init>(r8)
            r5.yandex(r0, r2)
            eؘٕؕ r0 = r10.f12792e
            if (r0 == 0) goto L3f
            eۡۦ r0 = r10.m3623e()
            eؙؖؗ r1 = new eؙؖؗ
            r5 = 2
            r1.<init>(r10, r2, r4, r5)
            defpackage.AbstractC5336e.purchase(r0, r4, r7, r1, r3)
        L3f:
            r0 = r6
            goto L42
        L41:
            r0 = r7
        L42:
            boolean r11 = r10.mo2024e(r11)
            if (r11 != 0) goto L79
            if (r0 == 0) goto L7a
            goto L79
        L4b:
            boolean r2 = r10.f12798e
            if (r2 == 0) goto L7a
            int r2 = defpackage.AbstractC9835e.adcel(r11)
            if (r2 != r6) goto L7a
            boolean r2 = defpackage.AbstractC9546e.Signature(r11)
            if (r2 == 0) goto L7a
            java.lang.Object r0 = r5.billing(r0)
            eٍؚ٘ r0 = (defpackage.C17612e) r0
            if (r0 == 0) goto L77
            eؘٕؕ r1 = r10.f12792e
            if (r1 == 0) goto L74
            eۡۦ r1 = r10.m3623e()
            eؙؖؗ r2 = new eؙؖؗ
            r5 = 3
            r2.<init>(r10, r0, r4, r5)
            defpackage.AbstractC5336e.purchase(r1, r4, r7, r2, r3)
        L74:
            r10.mo2022e(r11)
        L77:
            if (r0 == 0) goto L7a
        L79:
            return r6
        L7a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC6102e.mo719native(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.InterfaceC4890e
    public final long pro() {
        return AbstractC15287e.ad;
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: protected */
    public void mo720protected() {
        C1639e c1639e;
        C15274e c15274e = this.f12792e;
        if (c15274e != null && (c1639e = this.f12794e) != null) {
            c15274e.vip(new C5754e(c1639e));
        }
        this.f12794e = null;
    }

    @Override // defpackage.InterfaceC17453e
    public final /* synthetic */ boolean smaato() {
        return true;
    }

    @Override // defpackage.InterfaceC2998e
    /* renamed from: strictfp */
    public final /* synthetic */ boolean mo1227strictfp(C2401e c2401e) {
        return false;
    }
}
