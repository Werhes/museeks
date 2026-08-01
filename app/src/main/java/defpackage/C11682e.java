package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِِؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11682e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f23483e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f23484e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final /* synthetic */ DownloaderService f23485e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public File f23486e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public String f23487e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public /* synthetic */ Object f23488e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Integer f23489e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public String f23490e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public AbstractC3002e f23491e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public AudioTrack f23492e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11682e(DownloaderService downloaderService, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f23485e = downloaderService;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f23488e = obj;
        this.f23484e |= RecyclerView.UNDEFINED_DURATION;
        return DownloaderService.mopub(this.f23485e, null, null, null, null, null, null, this);
    }
}
