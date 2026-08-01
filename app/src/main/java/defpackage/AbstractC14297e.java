package defpackage;

import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realmcJNI;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۠ۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC14297e extends AbstractC11130e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C17424e f28277e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C3657e f28278e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C7744e f28279e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C0912e f28280e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public boolean f28281e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C4199e f28282e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C5363e f28283e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C10523e f28284e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C10523e f28285e;

    /* JADX WARN: Type inference failed for: r10v4, types: [eؕ۟ؒ, java.lang.Object] */
    public AbstractC14297e(C4199e c4199e, C14918e c14918e, C17424e c17424e) {
        super(c14918e);
        this.f28282e = c4199e;
        this.f28277e = c17424e;
        this.f28280e = new C0912e(this, (C14911e) c4199e.f22046e);
        this.f28283e = new C5363e(new C1708e(c14918e, this, 2));
        this.f28279e = AbstractC14430e.appmetrica(yandex().ad(c4199e));
        this.f28281e = true;
        this.f28278e = new Object();
        C12329e c12329e = new C12329e(this);
        NativePointer nativePointer = yandex().f33290e;
        int i = 0;
        int i2 = 0;
        C15101e c15101e = new C15101e(0, c12329e, C12329e.class, "onRealmChanged", "onRealmChanged()V", i2, i, 26);
        long ptr$cinterop_release = ((LongPointerWrapper) nativePointer).getPtr$cinterop_release();
        int i3 = AbstractC6026e.ad;
        this.f28285e = new C10523e(new LongPointerWrapper(realmcJNI.realm_add_realm_changed_callback(ptr$cinterop_release, c15101e), false));
        NativePointer nativePointer2 = yandex().f33290e;
        this.f28284e = new C10523e(new LongPointerWrapper(realmcJNI.realm_add_schema_changed_callback(((LongPointerWrapper) nativePointer2).getPtr$cinterop_release(), new C11476e(1, c12329e, C12329e.class, "onSchemaChanged", "onSchemaChanged(Lio/realm/kotlin/internal/interop/NativePointer;)V", i2, i, 4)), false));
    }

    /* renamed from: eؒٞ٘ */
    public void mo3651e() {
        m3787e();
    }

    @Override // defpackage.AbstractC11130e, defpackage.InterfaceC0182e
    /* renamed from: eؚٕؗ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C16981e yandex() {
        return (C16981e) this.f28283e.getValue();
    }

    /* renamed from: eؘؗؕ, reason: contains not printable characters */
    public final void m3787e() {
        synchronized (this.f28278e) {
            try {
                C12247e c12247e = (C12247e) this.f28279e.ad;
                c12247e.getClass();
                C17621e subscription = AbstractC0054e.subscription(c12247e);
                C16981e yandex = yandex();
                yandex.getClass();
                if (!AbstractC0054e.adcel(yandex)) {
                    C16981e yandex2 = yandex();
                    yandex2.getClass();
                    if (!subscription.equals(AbstractC0054e.subscription(yandex2))) {
                        if (this.f28281e) {
                            ((C14911e) this.f22046e).metrica(this + " CLOSE-UNTRACKED " + subscription, new Object[0]);
                            C12247e c12247e2 = (C12247e) this.f28279e.ad;
                            c12247e2.getClass();
                            AbstractC0054e.appmetrica(c12247e2);
                        } else {
                            this.f28280e.admob((C12247e) this.f28279e.ad);
                        }
                        this.f28279e.ad = yandex().ad(this.f28282e);
                        C14911e c14911e = (C14911e) this.f22046e;
                        C12247e c12247e3 = (C12247e) this.f28279e.ad;
                        c12247e3.getClass();
                        c14911e.metrica(this + " ADVANCING " + subscription + " -> " + AbstractC0054e.subscription(c12247e3), new Object[0]);
                        this.f28281e = true;
                        Unit unit = Unit.INSTANCE;
                        this.f28280e.vip();
                    }
                }
            } finally {
            }
        }
    }

    /* renamed from: eؘِۢ, reason: contains not printable characters */
    public final C12247e m3788e() {
        C12247e c12247e;
        synchronized (this.f28278e) {
            try {
                Object obj = this.f28279e.ad;
                C12247e c12247e2 = (C12247e) obj;
                if (this.f28281e) {
                    c12247e2.getClass();
                    if (!AbstractC0054e.adcel(c12247e2)) {
                        ((C14911e) this.f22046e).metrica(this + " ENABLE-TRACKING " + AbstractC0054e.subscription(c12247e2), new Object[0]);
                        this.f28281e = false;
                    }
                }
                c12247e = (C12247e) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c12247e;
    }

    /* renamed from: eِٜ٘, reason: contains not printable characters */
    public final void m3789e() {
        C16981e yandex = yandex();
        yandex.getClass();
        AbstractC0054e.appmetrica(yandex);
        C12247e c12247e = (C12247e) this.f28279e.ad;
        C14911e c14911e = (C14911e) this.f22046e;
        c12247e.getClass();
        c14911e.metrica(this + " CLOSE-ACTIVE " + AbstractC0054e.subscription(c12247e), new Object[0]);
        AbstractC0054e.appmetrica(c12247e);
        this.f28280e.ad();
        this.f28285e.cancel();
        this.f28284e.cancel();
        ((C14911e) this.f22046e).vip("Realm closed: " + this, new Object[0]);
    }
}
