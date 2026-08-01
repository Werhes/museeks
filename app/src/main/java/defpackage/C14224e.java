package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14224e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC2558e f28098e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C1587e f28099e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AudioTrack f28100e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f28101e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f28102e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f28103e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14224e(C1587e c1587e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f28099e = c1587e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f28102e = obj;
        this.f28101e |= RecyclerView.UNDEFINED_DURATION;
        return this.f28099e.ad(null, null, this);
    }
}
