package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12451e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f24916e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12451e(AppActivity appActivity, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f24916e = appActivity;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C12451e(this.f24916e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C12451e) advert((InterfaceC5083e) obj2, (C18269e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        AbstractC2003e.purchase(obj);
        AppActivity appActivity = this.f24916e;
        AtomicBoolean atomicBoolean = appActivity.f36549e;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            Integer num = new Integer(R.drawable.ic_download_outline_28);
            VKXApplication vKXApplication = VKXApplication.f36528e;
            if (vKXApplication == null) {
                vKXApplication = null;
            }
            String string = vKXApplication.getString(R.string.cache_db_migration_completed);
            VKXApplication vKXApplication2 = VKXApplication.f36528e;
            C9402e.ad(appActivity, new C15076e(num, string, (vKXApplication2 != null ? vKXApplication2 : null).getString(R.string.cache_db_migration_completed_desc), null, null, 80));
        }
        return Unit.INSTANCE;
    }
}
