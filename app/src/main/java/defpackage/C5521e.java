package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؘٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5521e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f11803e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ DownloaderService f11804e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AudioTrack f11805e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f11806e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f11807e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public String f11808e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5521e(DownloaderService downloaderService, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f11804e = downloaderService;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f11807e = obj;
        this.f11806e |= RecyclerView.UNDEFINED_DURATION;
        int i = DownloaderService.f36551e;
        return this.f11804e.smaato(null, null, this);
    }
}
