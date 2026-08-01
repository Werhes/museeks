package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2501e extends AbstractC5604e {
    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        AudioBook audioBook = (AudioBook) obj;
        C7470e c7470e = (C7470e) interfaceC10283e;
        c7470e.f15244e.setOnClickListener(new ViewOnClickListenerC1249e(audioBook, 0));
        AbstractC2379e.metrica(c7470e.f15241e, AbstractC8769e.metrica(300, audioBook.admob), Integer.valueOf(R.drawable.placeholder_playlist), new C9377e(new AbstractC13386e(8.0f), 14));
        c7470e.f15243e.setText(audioBook.yandex);
        c7470e.f15242e.setText(AbstractC13480e.m3608try(audioBook.purchase, null, null, null, new C14407e(7), 31));
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return R.layout.list_item_playlist_no_subtitle;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C7470e.ad(layoutInflater, viewGroup);
    }
}
