package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2123e extends Exception {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5497e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2123e(int i, String str) {
        super("sRPC " + i + ": " + str);
        this.f5497e = 14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2123e(int i, String str, Throwable th) {
        super(str, th);
        this.f5497e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2123e(String str, int i) {
        super(str);
        this.f5497e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2123e(Throwable th) {
        super(th);
        this.f5497e = 7;
    }

    private final synchronized Throwable ad() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.f5497e) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ad();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }
}
