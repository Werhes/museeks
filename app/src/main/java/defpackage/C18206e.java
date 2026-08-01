package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18206e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public String f35631e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public int f35632e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public int f35633e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public int f35634e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public int f35635e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public /* synthetic */ Object f35636e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public int f35637e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public int f35638e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public int f35639e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C18206e f35640e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public int f35641e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final /* synthetic */ DownloaderService f35642e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AbstractC3002e f35643e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f35644e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public AudioTrack f35645e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Iterator f35646e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public int f35647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18206e(DownloaderService downloaderService, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f35642e = downloaderService;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f35636e = obj;
        this.f35647e |= RecyclerView.UNDEFINED_DURATION;
        return this.f35642e.purchase(null, this);
    }
}
