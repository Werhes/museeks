package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16934e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f33173e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33174e;

    public /* synthetic */ C16934e(int i, List list) {
        this.f33174e = i;
        this.f33173e = list;
    }

    public /* synthetic */ C16934e(C4581e c4581e, List list) {
        this.f33174e = 0;
        this.f33173e = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f33174e;
        List list = this.f33173e;
        switch (i) {
            case 0:
                List list2 = (List) obj;
                list2.add(new Catalog2Block.TextsBlock(28, "persist_disclaimer", null, null, null, Collections.singletonList("forDumb"), C11375e.ad));
                VKXApplication.Companion companion = VKXApplication.f36531e;
                list2.add(new Catalog2Block.ActionsBlock(AbstractC14363e.pro(), new Catalog2Layout.HorizontalButtons(BuildConfig.FLAVOR), Collections.singletonList(new Catalog2Button(new Catalog2ButtonAction.SynthCustomAction(VKXApplication.Companion.vip(R.string.shuffle), null, R.drawable.ic_shuffle_outline_24, new C16934e(1, list)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32766)), null, null, 24));
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(AbstractC6914e.billing((AudioTrack) it.next()));
                }
                list2.add(new Catalog2Block.MusicAudiosBlock(28, "persist_trackContent", null, null, null, arrayList, C17993e.ad));
                return Unit.INSTANCE;
            case 1:
                AbstractC13201e.vip((Context) obj, new C14474e(list), new C0086e(null, 0L, null, false, false, true, 95));
                return Unit.INSTANCE;
            default:
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((AbstractC5113e) it2.next()).vip();
                }
                return Unit.INSTANCE;
        }
    }
}
