package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ٘۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14053e implements InterfaceC13096e {
    public final View ad;
    public Rect advert;
    public C7911e appmetrica;
    public InterfaceC11678e billing;
    public C15860e purchase;
    public final C12775e smaato;
    public final C16911e vip;
    public Function1 metrica = new C17187e(21);
    public Function1 license = new C17187e(22);
    public C0398e yandex = new C0398e(C12347e.vip, 4, BuildConfig.FLAVOR);
    public C16174e startapp = C16174e.billing;
    public final ArrayList adcel = new ArrayList();
    public final Object mopub = AbstractC18039e.appmetrica(3, new C12851e(11, this));

    public C14053e(View view, C9445e c9445e, C16911e c16911e) {
        this.ad = view;
        this.vip = c16911e;
        this.smaato = new C12775e(c9445e, c16911e);
    }

    @Override // defpackage.InterfaceC13096e
    public final InputConnection ad(EditorInfo editorInfo) {
        C0398e c0398e = this.yandex;
        AbstractC0173e.advert(editorInfo, c0398e.ad.f20850e, c0398e.vip, this.startapp);
        C18120e c18120e = AbstractC12965e.ad;
        if (C5188e.license()) {
            C5188e.ad().startapp(editorInfo);
        }
        InputConnectionC10217e inputConnectionC10217e = new InputConnectionC10217e(this.yandex, new C15816e(16, this), this.startapp.metrica, this.appmetrica, this.purchase, this.billing);
        this.adcel.add(new WeakReference(inputConnectionC10217e));
        return inputConnectionC10217e;
    }
}
