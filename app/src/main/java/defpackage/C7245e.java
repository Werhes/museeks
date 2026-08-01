package defpackage;

import android.app.RemoteAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٙٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7245e implements Function3 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ RemoteAction f14802e;

    public C7245e(RemoteAction remoteAction) {
        this.f14802e = remoteAction;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((C3618e) obj).ad;
        C13770e c13770e = (C13770e) obj2;
        int intValue = ((Number) obj3).intValue();
        if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
            C17975e.f35235e.startapp(this.f14802e.getIcon(), c13770e, 48);
        } else {
            c13770e.m3659default();
        }
        return Unit.INSTANCE;
    }
}
