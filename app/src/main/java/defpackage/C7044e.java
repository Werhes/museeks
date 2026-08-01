package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.Type;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7044e {
    public final long ad;
    public final Object appmetrica;
    public final Object billing;
    public final Object license;
    public final Object metrica;
    public final Object purchase;
    public boolean vip;
    public final Object yandex;

    public C7044e(Context context, C8660e c8660e, Long l, Long l2) {
        this.vip = true;
        AbstractC9528e.startapp(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC9528e.startapp(applicationContext);
        this.metrica = applicationContext;
        this.purchase = l;
        this.billing = l2;
        if (c8660e != null) {
            this.appmetrica = c8660e;
            this.vip = c8660e.f17492e;
            this.ad = c8660e.f17493e;
            this.yandex = c8660e.f17491e;
            Bundle bundle = c8660e.f17494e;
            if (bundle != null) {
                this.license = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }

    public C7044e(RenderScript renderScript, long j) {
        this.metrica = renderScript;
        this.ad = j;
        this.yandex = AbstractC12501e.ad(-1, 0, null, 6);
        int i = (int) (j >> 32);
        int i2 = (i % 4) + i;
        int i3 = (int) (j & 4294967295L);
        int i4 = (i3 % 4) + i3;
        Allocation createTyped = Allocation.createTyped(renderScript, new Type.Builder(renderScript, Element.U8_4(renderScript)).setX(i2).setY(i4).create(), 33);
        this.appmetrica = createTyped;
        createTyped.setOnBufferAvailableListener(new Allocation.OnBufferAvailableListener() { // from class: eُٛۦ
            @Override // android.renderscript.Allocation.OnBufferAvailableListener
            public final void onBufferAvailable(Allocation allocation) {
                C7044e c7044e = C7044e.this;
                if (c7044e.vip) {
                    return;
                }
                allocation.ioReceive();
                AbstractC17113e.appmetrica((C14137e) c7044e.yandex, Unit.INSTANCE);
            }
        });
        Bitmap createBitmap = Bitmap.createBitmap(i2, i4, Bitmap.Config.ARGB_8888);
        this.billing = createBitmap;
        this.purchase = Allocation.createFromBitmap(renderScript, createBitmap);
        ScriptIntrinsicBlur create = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
        this.license = create;
        create.setInput(createTyped);
    }
}
