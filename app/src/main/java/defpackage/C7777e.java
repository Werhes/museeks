package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7777e extends AbstractC9615e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f15762e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ CarouselLayoutManager f15763e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7777e(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 1);
        this.f15762e = i;
        switch (i) {
            case 1:
                this.f15763e = carouselLayoutManager;
                super(0, 1);
                return;
            default:
                this.f15763e = carouselLayoutManager;
                return;
        }
    }

    @Override // defpackage.AbstractC9615e
    public final int appmetrica() {
        switch (this.f15762e) {
            case 0:
                return this.f15763e.m161goto();
            default:
                return 0;
        }
    }

    @Override // defpackage.AbstractC9615e
    public final int billing() {
        switch (this.f15762e) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f15763e;
                return carouselLayoutManager.amazon - carouselLayoutManager.m166this();
            default:
                return this.f15763e.amazon;
        }
    }

    @Override // defpackage.AbstractC9615e
    public final int license() {
        switch (this.f15762e) {
            case 0:
                return this.f15763e.loadAd;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f15763e;
                return carouselLayoutManager.loadAd - carouselLayoutManager.m162interface();
        }
    }

    @Override // defpackage.AbstractC9615e
    public final int startapp() {
        switch (this.f15762e) {
            case 0:
                return 0;
            default:
                return this.f15763e.m163native();
        }
    }

    @Override // defpackage.AbstractC9615e
    public final int yandex() {
        switch (this.f15762e) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f15763e;
                if (carouselLayoutManager.m184e()) {
                    return carouselLayoutManager.amazon;
                }
                return 0;
        }
    }
}
