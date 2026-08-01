package defpackage;

import java.io.IOException;

/* renamed from: eَِ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C10210e implements subs, InterfaceC5145e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Csuper f20191e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f20192e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f20193e;

    public C10210e(int i, int i2, Csuper csuper) {
        this.f20193e = i;
        this.f20192e = i2;
        this.f20191e = csuper;
    }

    public Cdefault advert() {
        return this.f20191e.m4640abstract(this.f20193e, this.f20192e);
    }

    @Override // defpackage.subs
    public final Cdefault billing() {
        try {
            return advert();
        } catch (IOException e) {
            throw new Cabstract(e.getMessage());
        }
    }
}
