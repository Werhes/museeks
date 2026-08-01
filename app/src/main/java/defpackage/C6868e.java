package defpackage;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6868e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Function0 metrica;
    public final /* synthetic */ AppActivity vip;

    public /* synthetic */ C6868e(Function0 function0, AppActivity appActivity, int i) {
        this.ad = i;
        this.metrica = function0;
        this.vip = appActivity;
    }

    public final void ad(ArrayList arrayList) {
        switch (this.ad) {
            case 0:
                C10277e c10277e = (C10277e) this.metrica;
                C8804e c8804e = (C8804e) AbstractC13480e.m3604this(arrayList);
                if (c8804e == null || c8804e.ad != 0) {
                    new C0585e().signatures(this.vip);
                    return;
                } else {
                    c10277e.invoke();
                    return;
                }
            default:
                C8804e c8804e2 = (C8804e) AbstractC13480e.m3604this(arrayList);
                if (c8804e2 == null || c8804e2.ad != 0) {
                    new C17890e().signatures(this.vip);
                    return;
                } else {
                    this.metrica.invoke();
                    return;
                }
        }
    }
}
