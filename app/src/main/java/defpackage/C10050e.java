package defpackage;

/* renamed from: eَؕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10050e extends C10210e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final boolean f19852e;

    public C10050e(int i, int i2, boolean z, Csuper csuper) {
        super(i, i2, csuper);
        this.f19852e = z;
    }

    @Override // defpackage.C10210e, defpackage.InterfaceC5145e
    public final Cdefault advert() {
        boolean z = this.f19852e;
        Csuper csuper = this.f20191e;
        int i = this.f20193e;
        int i2 = this.f20192e;
        if (!z) {
            return new Cstrictfp(4, i, i2, new Cprotected(((C9482e) ((AbstractC9907e) csuper.f36469e)).license()));
        }
        crashlytics m4654super = csuper.m4654super();
        return m4654super.f1117e == 1 ? new Cstrictfp(3, i, i2, m4654super.adcel(0)) : new Cstrictfp(4, i, i2, AbstractC5023e.ad(m4654super));
    }
}
