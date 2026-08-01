package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: eٖؒۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15936e implements applovin {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C14333e f31393e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Csuper f31394e;

    public C15936e(Csuper csuper) {
        this.f31394e = csuper;
    }

    public static C16940e ad(Csuper csuper) {
        C14333e c14333e = new C14333e(csuper);
        return new C16940e(c14333e.f28357e, AbstractC9460e.metrica(c14333e));
    }

    @Override // defpackage.applovin
    public final int adcel() {
        return this.f31393e.f28357e;
    }

    @Override // defpackage.InterfaceC5145e
    public final Cdefault advert() {
        return ad(this.f31394e);
    }

    @Override // defpackage.subs
    public final Cdefault billing() {
        try {
            return ad(this.f31394e);
        } catch (IOException e) {
            throw new Cabstract(AbstractC8703e.admob(e, new StringBuilder("IOException converting stream to byte array: ")), e, 0);
        }
    }

    @Override // defpackage.applovin
    public final InputStream startapp() {
        C14333e c14333e = new C14333e(this.f31394e);
        this.f31393e = c14333e;
        return c14333e;
    }
}
