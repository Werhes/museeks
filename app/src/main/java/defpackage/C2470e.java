package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2470e extends View {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ RunnableC14110e f6314e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2470e(RunnableC14110e runnableC14110e, Context context) {
        super(context);
        this.f6314e = runnableC14110e;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        this.f6314e.run();
    }
}
