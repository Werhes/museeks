package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٕٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15484e extends AbstractC7326e {
    public final /* synthetic */ C2271e ad;
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC13124e vip;

    public C15484e(ViewTreeObserverOnPreDrawListenerC13124e viewTreeObserverOnPreDrawListenerC13124e, C2271e c2271e) {
        this.vip = viewTreeObserverOnPreDrawListenerC13124e;
        this.ad = c2271e;
    }

    @Override // defpackage.AbstractC7326e, defpackage.InterfaceC10190e
    public final void ad(AbstractC18109e abstractC18109e) {
        ((ArrayList) this.ad.get(this.vip.f26089e)).remove(abstractC18109e);
        abstractC18109e.ads(this);
    }
}
