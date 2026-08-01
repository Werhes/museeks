package defpackage;

import java.io.Serializable;

/* renamed from: abstract, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Cabstract extends IllegalStateException {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Serializable f0e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1e;

    public Cabstract(C5042e c5042e) {
        this.f1e = 3;
        this.f0e = "Response already received: " + c5042e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cabstract(String str) {
        super(str);
        this.f1e = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cabstract(String str, Exception exc, int i) {
        super(str);
        this.f1e = i;
        this.f0e = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.f1e) {
            case 0:
                return (Exception) this.f0e;
            case 1:
                return (Exception) this.f0e;
            case 2:
                return (Exception) this.f0e;
            default:
                return super.getCause();
        }
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        switch (this.f1e) {
            case 3:
                return (String) this.f0e;
            default:
                return super.getMessage();
        }
    }
}
