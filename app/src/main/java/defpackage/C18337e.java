package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۙؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18337e extends AbstractC10731e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ Object f36006e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public InterfaceC9354e f36007e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f36008e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ DownloaderService f36009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18337e(DownloaderService downloaderService, AbstractC10731e abstractC10731e) {
        super(abstractC10731e);
        this.f36009e = downloaderService;
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        this.f36006e = obj;
        this.f36008e |= RecyclerView.UNDEFINED_DURATION;
        int i = DownloaderService.f36551e;
        return this.f36009e.subscription(null, null, this);
    }
}
