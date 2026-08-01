package bruhcollective.itaysonlab.libvkmusic.objects;

import defpackage.InterfaceC15377e;
import defpackage.InterfaceC3919e;
import java.util.List;
import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC3919e(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbruhcollective/itaysonlab/libvkmusic/objects/UmaTag;", "Leُٕؓ;", "app_publicReleaseRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UmaTag implements InterfaceC15377e {
    public final String ad;
    public final List license;
    public final UmaCover metrica;
    public final long vip;

    public UmaTag(String str, long j, UmaCover umaCover, List list) {
        this.ad = str;
        this.vip = j;
        this.metrica = umaCover;
        this.license = list;
    }

    @Override // defpackage.InterfaceC15377e
    public final String getItemId() {
        return String.valueOf(this.vip);
    }
}
