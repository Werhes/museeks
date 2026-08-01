package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؑ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3822e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public AudioTrack f8449e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f8450e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ DownloaderService f8451e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f8452e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public String f8453e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public /* synthetic */ Object f8454e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public InterfaceC9354e f8455e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f8456e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public DownloaderService f8457e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public DownloaderService f8458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3822e(DownloaderService downloaderService, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f8451e = downloaderService;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f8454e = obj;
        this.f8450e |= RecyclerView.UNDEFINED_DURATION;
        int i = DownloaderService.f36551e;
        return this.f8451e.Signature(null, null, null, null, this);
    }
}
