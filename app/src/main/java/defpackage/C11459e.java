package defpackage;

import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioPlaylistSnippetEntry;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؒٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11459e extends AbstractC18406e {
    public static final C5363e yandex = new C5363e(new C14561e(11));
    public final String billing;
    public final String purchase;

    public C11459e(int i, int i2, int i3, long j, String str) {
        super(AbstractC18453e.purchase(List.class, AudioPlaylistSnippetEntry.class));
        this.purchase = "execute";
        this.billing = BuildConfig.FLAVOR;
        amazon("code", (String) yandex.getValue());
        smaato(Integer.valueOf(i), "playlist_id");
        Signature("owner_id", Long.valueOf(j));
        amazon("access_key", str);
        smaato(3, "count");
        smaato(Integer.valueOf(i2), "offset");
        smaato(Integer.valueOf(i3), "shuffle_seed");
    }

    @Override // defpackage.AbstractC18406e
    public final String adcel() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC18406e
    public final String mopub() {
        return this.billing;
    }
}
