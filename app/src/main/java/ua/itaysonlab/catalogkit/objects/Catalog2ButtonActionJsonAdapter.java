package ua.itaysonlab.catalogkit.objects;

import defpackage.AbstractC13345e;
import defpackage.AbstractC17080e;
import defpackage.AbstractC3442e;
import defpackage.AbstractC3820e;
import defpackage.AbstractC9546e;
import defpackage.C0780e;
import defpackage.C0947e;
import defpackage.C10164e;
import defpackage.C12079e;
import defpackage.C14172e;
import defpackage.C1461e;
import defpackage.C16512e;
import defpackage.C17177e;
import defpackage.C1850e;
import defpackage.C2065e;
import defpackage.C3295e;
import defpackage.C3528e;
import defpackage.C4153e;
import defpackage.C4582e;
import defpackage.C5295e;
import defpackage.C5536e;
import defpackage.C5793e;
import defpackage.C7417e;
import defpackage.C8799e;
import defpackage.C9256e;
import defpackage.C9945e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Catalog2ButtonActionJsonAdapter extends AbstractC13345e {
    public final AbstractC13345e ad;

    public Catalog2ButtonActionJsonAdapter(C14172e c14172e) {
        List list = Collections.EMPTY_LIST;
        if (list.contains("create_playlist")) {
            throw new IllegalArgumentException("Labels must be unique.");
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.add("create_playlist");
        ArrayList arrayList2 = new ArrayList(list);
        arrayList2.add(C9256e.class);
        C2065e vip = new C2065e(Catalog2ButtonAction.class, "type", arrayList, arrayList2, null).metrica(C5536e.class, "edit_items").metrica(C3528e.class, "enter_edit_mode").metrica(C16512e.class, "open_section").metrica(Catalog2ButtonAction.OpenUrl.class, "open_url").metrica(C8799e.class, "play_audios_from_block").metrica(C4582e.class, "play_shuffled_audios_from_block").metrica(Catalog2ButtonAction.PlayVkMix.class, "play_vk_mix").metrica(C9945e.class, "reorder_items").metrica(C12079e.class, "playlists_lists").metrica(C5295e.class, "select_sorting").metrica(C5793e.class, "owner_button").metrica(C10164e.class, "switch_section").metrica(C1850e.class, "synth_clear_search_history").metrica(Catalog2ButtonAction.SynthCustomAction.class, "synth_custom_action").metrica(C4153e.class, "toggle_artist_subscription").metrica(C0780e.class, "toggle_curator_subscription").metrica(C1461e.class, "music_follow_owner").vip(C17177e.ad);
        C7417e metrica = c14172e.metrica();
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C9256e.class)), new C0947e(C9256e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C5536e.class)), new C0947e(C5536e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C3528e.class)), new C0947e(C3528e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C16512e.class)), new C0947e(C16512e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C8799e.class)), new C0947e(C8799e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C4582e.class)), new C0947e(C4582e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C9945e.class)), new C0947e(C9945e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C12079e.class)), new C0947e(C12079e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C5295e.class)), new C0947e(C5295e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C5793e.class)), new C0947e(C5793e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C10164e.class)), new C0947e(C10164e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C1850e.class)), new C0947e(C1850e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C4153e.class)), new C0947e(C4153e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C0780e.class)), new C0947e(C0780e.ad));
        metrica.ad(AbstractC9546e.smaato(AbstractC3820e.ad(C1461e.class)), new C0947e(C1461e.ad));
        this.ad = vip.ad(Catalog2ButtonAction.class, C3295e.f7451e, new C14172e(metrica));
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        this.ad.purchase(abstractC3442e, obj);
    }

    public final String toString() {
        return "GeneratedSealedJsonAdapter(Catalog2ButtonAction)";
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        return this.ad.vip(abstractC17080e);
    }
}
