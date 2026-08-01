package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6869e implements InterfaceC5808e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16786e f14114e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14115e;

    public /* synthetic */ C6869e(C16786e c16786e, int i) {
        this.f14115e = i;
        this.f14114e = c16786e;
    }

    @Override // defpackage.InterfaceC5808e
    public final Object smaato(C18464e c18464e) {
        switch (this.f14115e) {
            case 0:
                return new C18162e((Context) c18464e.ad(Context.class), ((C14679e) c18464e.ad(C14679e.class)).license(), c18464e.m4510e(C17647e.class), c18464e.appmetrica(C1779e.class), (Executor) c18464e.inmobi(this.f14114e));
            default:
                return FirebaseMessagingRegistrar.ad(this.f14114e, c18464e);
        }
    }
}
