package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11359e extends AbstractC6126e implements InterfaceC1683e, InterfaceC0479e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public C15274e f22859e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public EnumC17426e f22860e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public InterfaceC10481e f22861e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public boolean f22862e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public InterfaceC5077e f22863e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public C10318e f22864e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public C10469e f22865e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public InterfaceC13547e f22866e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public C11644e f22867e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public boolean f22868e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public boolean f22869e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public C11644e f22870e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public InterfaceC8642e f22871e;

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    public final boolean m3201e() {
        return (this.f27016e ? AbstractC5851e.mopub(this).f27610e : EnumC7792e.f15794e) != EnumC7792e.f15793e || this.f22860e == EnumC17426e.f34146e;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        InterfaceC5077e interfaceC5077e = this.f22863e;
        if (interfaceC5077e != null) {
            m2042e(interfaceC5077e);
        }
    }

    /* renamed from: eًْٕ, reason: contains not printable characters */
    public final void m3202e(C11644e c11644e, InterfaceC13547e interfaceC13547e, InterfaceC8642e interfaceC8642e, C15274e c15274e, EnumC17426e enumC17426e, InterfaceC10481e interfaceC10481e, boolean z, boolean z2) {
        boolean z3;
        this.f22861e = interfaceC10481e;
        this.f22860e = enumC17426e;
        boolean z4 = true;
        if (this.f22869e != z) {
            this.f22869e = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (AbstractC7890e.billing(this.f22870e, c11644e)) {
            z4 = false;
        } else {
            this.f22870e = c11644e;
        }
        if (z3 || (z4 && !z)) {
            InterfaceC5077e interfaceC5077e = this.f22863e;
            if (interfaceC5077e != null) {
                m2042e(interfaceC5077e);
            }
            this.f22863e = null;
            m3203e();
        }
        this.f22868e = z2;
        this.f22871e = interfaceC8642e;
        this.f22859e = c15274e;
        this.f22866e = interfaceC13547e;
        boolean m3201e = m3201e();
        this.f22862e = m3201e;
        C10469e c10469e = this.f22865e;
        if (c10469e != null) {
            c10469e.m2812e(this.f22869e ? this.f22867e : this.f22870e, interfaceC13547e, interfaceC8642e, c15274e, enumC17426e, interfaceC10481e, z2, m3201e);
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؘٖؗ */
    public final void mo1339e() {
        boolean m3201e = m3201e();
        if (this.f22862e != m3201e) {
            this.f22862e = m3201e;
            InterfaceC10481e interfaceC10481e = this.f22861e;
            EnumC17426e enumC17426e = this.f22860e;
            boolean z = this.f22869e;
            C11644e c11644e = z ? this.f22867e : this.f22870e;
            m3202e(c11644e, this.f22866e, this.f22871e, this.f22859e, enumC17426e, interfaceC10481e, z, this.f22868e);
        }
    }

    /* renamed from: eٖٔۧ, reason: contains not printable characters */
    public final void m3203e() {
        InterfaceC5077e interfaceC5077e = this.f22863e;
        if (interfaceC5077e != null) {
            if (((AbstractC13616e) interfaceC5077e).f27022e.f27016e) {
                return;
            }
            m2050e(interfaceC5077e);
            return;
        }
        if (this.f22869e) {
            AbstractC16425e.purchase(this, new C13465e(27, this));
        }
        C11644e c11644e = this.f22869e ? this.f22867e : this.f22870e;
        if (c11644e != null) {
            AbstractC6126e abstractC6126e = c11644e.startapp;
            if (abstractC6126e.f27022e.f27016e) {
                return;
            }
            m2050e(abstractC6126e);
            this.f22863e = abstractC6126e;
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        this.f22862e = m3201e();
        m3203e();
        if (this.f22865e == null) {
            InterfaceC10481e interfaceC10481e = this.f22861e;
            C11644e c11644e = this.f22869e ? this.f22867e : this.f22870e;
            C10469e c10469e = new C10469e(c11644e, this.f22866e, this.f22871e, this.f22859e, this.f22860e, interfaceC10481e, this.f22868e, this.f22862e);
            m2050e(c10469e);
            this.f22865e = c10469e;
        }
    }

    @Override // defpackage.InterfaceC0479e
    /* renamed from: for */
    public final void mo343for() {
        C10318e c10318e = (C10318e) AbstractC10432e.vip(this, AbstractC8281e.ad);
        if (AbstractC7890e.billing(c10318e, this.f22864e)) {
            return;
        }
        this.f22864e = c10318e;
        this.f22867e = null;
        InterfaceC5077e interfaceC5077e = this.f22863e;
        if (interfaceC5077e != null) {
            m2042e(interfaceC5077e);
        }
        this.f22863e = null;
        m3203e();
        C10469e c10469e = this.f22865e;
        if (c10469e != null) {
            InterfaceC10481e interfaceC10481e = this.f22861e;
            EnumC17426e enumC17426e = this.f22860e;
            C11644e c11644e = this.f22869e ? this.f22867e : this.f22870e;
            c10469e.m2812e(c11644e, this.f22866e, this.f22871e, this.f22859e, enumC17426e, interfaceC10481e, this.f22868e, this.f22862e);
        }
    }
}
