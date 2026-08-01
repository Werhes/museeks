package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12472e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ PlaybackService f24968e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public /* synthetic */ Object f24969e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f24970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12472e(PlaybackService playbackService, InterfaceC5083e interfaceC5083e) {
        super(interfaceC5083e);
        this.f24968e = playbackService;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f24969e = obj;
        this.f24970e |= RecyclerView.UNDEFINED_DURATION;
        return PlaybackService.metrica(this.f24968e, this);
    }
}
