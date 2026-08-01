package defpackage;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ٔۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17770e extends AbstractC16696e {
    public final C5363e appmetrica;
    public final int billing;
    public final boolean license;
    public final int metrica;
    public final C5363e purchase;
    public final String[] vip;

    public C17770e() {
        String[] strArr;
        try {
            strArr = AbstractC11360e.ad();
        } catch (Exception e) {
            if (!(e instanceof IOException)) {
                e.printStackTrace();
            }
            strArr = null;
        }
        this.vip = strArr;
        this.metrica = R.string.storage_external;
        this.license = !(strArr == null || strArr.length == 0);
        final int i = 0;
        this.appmetrica = new C5363e(new Function0(this) { // from class: eٍؚۘ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C17770e f19193e;

            {
                this.f19193e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        File file = new File(this.f19193e.vip[0], "cache_v2");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        return file;
                    default:
                        File file2 = new File(this.f19193e.vip[0], "cdcm_temp");
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        return file2;
                }
            }
        });
        final int i2 = 1;
        this.purchase = new C5363e(new Function0(this) { // from class: eٍؚۘ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C17770e f19193e;

            {
                this.f19193e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        File file = new File(this.f19193e.vip[0], "cache_v2");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        return file;
                    default:
                        File file2 = new File(this.f19193e.vip[0], "cdcm_temp");
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        return file2;
                }
            }
        });
        this.billing = 1;
    }

    @Override // defpackage.AbstractC16696e
    public final int ad() {
        return this.billing;
    }

    @Override // defpackage.AbstractC16696e
    public final int license() {
        return this.metrica;
    }

    @Override // defpackage.AbstractC16696e
    public final File metrica() {
        return (File) this.purchase.getValue();
    }

    @Override // defpackage.AbstractC16696e
    public final File vip() {
        return (File) this.appmetrica.getValue();
    }
}
