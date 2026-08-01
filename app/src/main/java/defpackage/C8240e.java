package defpackage;

import java.io.IOException;

/* renamed from: eًؘ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8240e extends IOException {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Exception f16739e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8240e(String str, Exception exc) {
        super(str);
        this.f16739e = exc;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f16739e;
    }
}
