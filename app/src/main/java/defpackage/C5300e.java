package defpackage;

import java.security.cert.CertSelector;
import java.security.cert.Certificate;

/* renamed from: eؗۧٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5300e implements InterfaceC14659e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final CertSelector f11387e;

    public C5300e(CertSelector certSelector) {
        this.f11387e = certSelector;
    }

    @Override // defpackage.InterfaceC14659e
    public final boolean advert(Object obj) {
        return this.f11387e.match((Certificate) obj);
    }

    public final Object clone() {
        return new C5300e(this.f11387e);
    }
}
