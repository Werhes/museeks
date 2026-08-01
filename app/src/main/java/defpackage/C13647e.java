package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۧؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13647e extends ClickableSpan {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractC9606e f27065e;

    public C13647e(AbstractC9606e abstractC9606e) {
        this.f27065e = abstractC9606e;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        C18070e ad = this.f27065e.ad();
        if (ad != null) {
            ((C13553e) ad.f35442e).invoke((MainArtist) ad.f35441e);
        }
    }
}
