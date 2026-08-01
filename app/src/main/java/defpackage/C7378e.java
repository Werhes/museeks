package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7378e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C2996e f15120e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C2996e f15121e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C11099e f15122e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f15123e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f15124e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public AudioTrack f15125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7378e(C2996e c2996e, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f15121e = c2996e;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f15124e = obj;
        this.f15123e |= RecyclerView.UNDEFINED_DURATION;
        return this.f15121e.ad(null, this);
    }
}
