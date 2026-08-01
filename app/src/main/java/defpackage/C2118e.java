package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۜ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2118e extends ContentObserver {
    public final ContentResolver ad;
    public final /* synthetic */ C7116e metrica;
    public final Uri vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2118e(C7116e c7116e, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.metrica = c7116e;
        this.ad = contentResolver;
        this.vip = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.metrica.metrica();
    }
}
