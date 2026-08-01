package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14952e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ List f29645e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ EnumC15845e f29646e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C17046e f29647e;

    public C14952e(C17046e c17046e, EnumC15845e enumC15845e, List list) {
        this.f29647e = c17046e;
        this.f29646e = enumC15845e;
        this.f29645e = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C8416e c8416e = C8416e.appmetrica;
        CatalogArtist catalogArtist = this.f29647e.f33387e;
        c8416e.vip(new C0389e(new AudioPlaylist(0, 0L, null, null, catalogArtist.ad + " - " + this.f29646e.f31269e, null, 0, 0, 0, 0L, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, false, null, false, false, -17, 7), this.f29645e, catalogArtist.ad));
        return Unit.INSTANCE;
    }
}
