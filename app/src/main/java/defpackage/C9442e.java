package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9442e extends IllegalStateException {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ int f18784e = 0;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18785e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9442e(int i) {
        super("Duplicate Content-Length header");
        this.f18785e = i;
        switch (i) {
            case 7:
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9442e(int i, String str, Throwable th) {
        super(str, th);
        this.f18785e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9442e(AbstractC16824e abstractC16824e, String str) {
        super("Bad response: " + abstractC16824e + ". Text: \"" + str + '\"');
        this.f18785e = 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9442e(String str) {
        super(AbstractC5087e.m1746extends("Content-Encoding: ", str, " unsupported."));
        this.f18785e = 12;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9442e(String str, int i) {
        super(str);
        this.f18785e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9442e(String str, Throwable th) {
        super(AbstractC5087e.m1746extends("Concurrent ", str, " attempts"), th);
        this.f18785e = 2;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.f18785e) {
            case 0:
                return null;
            default:
                return super.getCause();
        }
    }
}
