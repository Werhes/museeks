package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: eؑۡٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0634e implements Cbreak {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f2861e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f2862e = 1;

    public /* synthetic */ C0634e() {
    }

    public C0634e(Csuper csuper) {
        this.f2861e = csuper;
    }

    @Override // defpackage.InterfaceC5145e
    public final Cdefault advert() {
        switch (this.f2862e) {
            case 0:
                return new C6210e(AbstractC9460e.metrica(new C6235e((Csuper) this.f2861e)), null);
            default:
                return new Cprotected(((C9482e) this.f2861e).license());
        }
    }

    @Override // defpackage.Cbreak
    public final InputStream appmetrica() {
        switch (this.f2862e) {
            case 0:
                return new C6235e((Csuper) this.f2861e);
            default:
                return (C9482e) this.f2861e;
        }
    }

    @Override // defpackage.subs
    public final Cdefault billing() {
        switch (this.f2862e) {
            case 0:
                try {
                    return new C6210e(AbstractC9460e.metrica(new C6235e((Csuper) this.f2861e)), null);
                } catch (IOException e) {
                    throw new Cabstract(AbstractC8703e.admob(e, new StringBuilder("IOException converting stream to byte array: ")), e, 0);
                }
            default:
                try {
                    return advert();
                } catch (IOException e2) {
                    throw new Cabstract(AbstractC8703e.admob(e2, new StringBuilder("IOException converting stream to byte array: ")), e2, 0);
                }
        }
    }
}
