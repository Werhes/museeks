package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9396e implements InterfaceC17421e, InterfaceC11659e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C18405e f18693e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final LinkedHashMap f18694e = new LinkedHashMap();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public EnumC8291e f18692e = EnumC8291e.f16967e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final ArrayList f18691e = new ArrayList();

    public C9396e(C18405e c18405e) {
        this.f18693e = c18405e;
    }

    public final void ad(boolean z) {
        EnumC8291e enumC8291e = EnumC8291e.f16967e;
        EnumC8291e enumC8291e2 = z ? EnumC8291e.f16968e : enumC8291e;
        if (this.f18692e == enumC8291e2) {
            return;
        }
        this.f18692e = enumC8291e2;
        if (enumC8291e2 == enumC8291e) {
            ArrayList arrayList = this.f18691e;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(true);
            }
            arrayList.clear();
        }
        for (Map.Entry entry : this.f18694e.entrySet()) {
            try {
                ((Executor) entry.getValue()).execute(new RunnableC2623e(entry, enumC8291e2, 13));
            } catch (RejectedExecutionException e) {
                AbstractC9464e.mopub(this.f18693e.ad, "Unable to post to the supplied executor.", e);
            }
        }
    }

    @Override // defpackage.InterfaceC11659e
    public final void loadAd(InterfaceC4868e interfaceC4868e) {
        this.f18693e.yandex.execute(new RunnableC2623e(this, interfaceC4868e, 14));
    }

    @Override // defpackage.InterfaceC11659e
    public final void metrica(Executor executor, InterfaceC4868e interfaceC4868e) {
        this.f18693e.yandex.execute(new RunnableC4904e(19, this, interfaceC4868e, executor));
    }

    @Override // defpackage.InterfaceC11659e
    public final ListenableFuture startapp() {
        return AbstractC5750e.purchase(new C0211e(27, this));
    }
}
