package defpackage;

import android.app.Activity;
import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۨۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C13665e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6023e f27090e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27091e;

    public /* synthetic */ C13665e(C6023e c6023e, int i) {
        this.f27091e = i;
        this.f27090e = c6023e;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r2v4, types: [eؚّ٘, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27091e) {
            case 0:
                return new RunnableC12667e(this.f27090e);
            case 1:
                C6023e c6023e = this.f27090e;
                C10990e c10990e = C7108e.ad;
                Activity activity = c6023e.f12689e;
                C7108e c7108e = C7108e.vip;
                if (c7108e == null) {
                    synchronized (c10990e) {
                        C7108e c7108e2 = C7108e.vip;
                        c7108e = c7108e2;
                        if (c7108e2 == null) {
                            ?? obj = new Object();
                            C7108e.vip = obj;
                            activity.getSharedPreferences("com.skydoves.balloon", 0);
                            c7108e = obj;
                        }
                    }
                }
                return c7108e;
            default:
                C6023e c6023e2 = this.f27090e;
                c6023e2.f12690e = false;
                c6023e2.f12681e.dismiss();
                c6023e2.f12691e.dismiss();
                ((Handler) c6023e2.f12688e.getValue()).removeCallbacks((RunnableC12667e) c6023e2.f12683e.getValue());
                return Unit.INSTANCE;
        }
    }
}
